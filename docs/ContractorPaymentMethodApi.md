# ContractorPaymentMethodApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBankAccount**](ContractorPaymentMethodApi.md#createBankAccount) | **POST** /v1/contractors/{contractor_uuid}/bank_accounts | Create an contractor bank account |
| [**getContractorPaymentMethod**](ContractorPaymentMethodApi.md#getContractorPaymentMethod) | **GET** /v1/contractors/{contractor_uuid}/payment_method | Get a contractor&#39;s payment method |
| [**listBankAccounts**](ContractorPaymentMethodApi.md#listBankAccounts) | **GET** /v1/contractors/{contractor_uuid}/bank_accounts | Get all contractor bank accounts |
| [**updateBankAccount**](ContractorPaymentMethodApi.md#updateBankAccount) | **PUT** /v1/contractors/{contractor_uuid}/payment_method | Update a contractor&#39;s payment method |


<a name="createBankAccount"></a>
# **createBankAccount**
> ContractorBankAccount createBankAccount(contractorUuid).xGustoAPIVersion(xGustoAPIVersion).contractorPaymentMethodCreateBankAccountRequest(contractorPaymentMethodCreateBankAccountRequest).execute();

Create an contractor bank account

Creates a contractor bank account.  Note: We currently only support one bank account per contractor. Using this endpoint on a contractor who has already has a bank account will just replace it.  scope: &#x60;contractor_payment_methods:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorPaymentMethodApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    String name = "name_example";
    String routingNumber = "routingNumber_example";
    String accountNumber = "accountNumber_example";
    String accountType = "Checking";
    String contractorUuid = "contractorUuid_example"; // The UUID of the contractor
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      ContractorBankAccount result = client
              .contractorPaymentMethod
              .createBankAccount(name, routingNumber, accountNumber, accountType, contractorUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getContractorUuid());
      System.out.println(result.getAccountType());
      System.out.println(result.getName());
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getHiddenAccountNumber());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentMethodApi#createBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractorBankAccount> response = client
              .contractorPaymentMethod
              .createBankAccount(name, routingNumber, accountNumber, accountType, contractorUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentMethodApi#createBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractorUuid** | **String**| The UUID of the contractor | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **contractorPaymentMethodCreateBankAccountRequest** | [**ContractorPaymentMethodCreateBankAccountRequest**](ContractorPaymentMethodCreateBankAccountRequest.md)|  | [optional] |

### Return type

[**ContractorBankAccount**](ContractorBankAccount.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getContractorPaymentMethod"></a>
# **getContractorPaymentMethod**
> ContractorPaymentMethod getContractorPaymentMethod(contractorUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a contractor&#39;s payment method

Fetches a contractor&#39;s payment method. A contractor payment method describes how the payment should be split across the contractor&#39;s associated bank accounts.  scope: &#x60;contractor_payment_methods:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorPaymentMethodApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    String contractorUuid = "contractorUuid_example"; // The UUID of the contractor
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      ContractorPaymentMethod result = client
              .contractorPaymentMethod
              .getContractorPaymentMethod(contractorUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getType());
      System.out.println(result.getSplitBy());
      System.out.println(result.getSplits());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentMethodApi#getContractorPaymentMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractorPaymentMethod> response = client
              .contractorPaymentMethod
              .getContractorPaymentMethod(contractorUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentMethodApi#getContractorPaymentMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractorUuid** | **String**| The UUID of the contractor | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**ContractorPaymentMethod**](ContractorPaymentMethod.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="listBankAccounts"></a>
# **listBankAccounts**
> List&lt;ContractorBankAccount&gt; listBankAccounts(contractorUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get all contractor bank accounts

Returns all contractor bank accounts.  scope: &#x60;contractor_payment_methods:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorPaymentMethodApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    String contractorUuid = "contractorUuid_example"; // The UUID of the contractor
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<ContractorBankAccount> result = client
              .contractorPaymentMethod
              .listBankAccounts(contractorUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentMethodApi#listBankAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ContractorBankAccount>> response = client
              .contractorPaymentMethod
              .listBankAccounts(contractorUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentMethodApi#listBankAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractorUuid** | **String**| The UUID of the contractor | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**List&lt;ContractorBankAccount&gt;**](ContractorBankAccount.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="updateBankAccount"></a>
# **updateBankAccount**
> ContractorPaymentMethod updateBankAccount(contractorUuid).xGustoAPIVersion(xGustoAPIVersion).contractorPaymentMethodUpdateBankAccountRequest(contractorPaymentMethodUpdateBankAccountRequest).execute();

Update a contractor&#39;s payment method

Updates a contractor&#39;s payment method. Note that creating a contractor bank account will also update the contractor&#39;s payment method.  scope: &#x60;contractor_payment_methods:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorPaymentMethodApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    String contractorUuid = "contractorUuid_example"; // The UUID of the contractor
    String version = "version_example"; // The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
    String type = "Direct Deposit"; // The payment method type. If type is Direct Deposit, the contractor is required to have a bank account. see [Bank account endpoint](./post-v1-contractors-contractor_uuid-bank_accounts)
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      ContractorPaymentMethod result = client
              .contractorPaymentMethod
              .updateBankAccount(contractorUuid)
              .version(version)
              .type(type)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getType());
      System.out.println(result.getSplitBy());
      System.out.println(result.getSplits());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentMethodApi#updateBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractorPaymentMethod> response = client
              .contractorPaymentMethod
              .updateBankAccount(contractorUuid)
              .version(version)
              .type(type)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentMethodApi#updateBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractorUuid** | **String**| The UUID of the contractor | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **contractorPaymentMethodUpdateBankAccountRequest** | [**ContractorPaymentMethodUpdateBankAccountRequest**](ContractorPaymentMethodUpdateBankAccountRequest.md)|  | [optional] |

### Return type

[**ContractorPaymentMethod**](ContractorPaymentMethod.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

