# EmployeePaymentMethodApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBankAccount**](EmployeePaymentMethodApi.md#createBankAccount) | **POST** /v1/employees/{employee_id}/bank_accounts | Create an employee bank account |
| [**deleteBankAccount**](EmployeePaymentMethodApi.md#deleteBankAccount) | **DELETE** /v1/employees/{employee_id}/bank_accounts/{bank_account_uuid} | Delete an employee bank account |
| [**getBankAccounts**](EmployeePaymentMethodApi.md#getBankAccounts) | **GET** /v1/employees/{employee_id}/payment_method | Get an employee&#39;s payment method |
| [**listBankAccounts**](EmployeePaymentMethodApi.md#listBankAccounts) | **GET** /v1/employees/{employee_id}/bank_accounts | Get all employee bank accounts |
| [**updatePaymentMethod**](EmployeePaymentMethodApi.md#updatePaymentMethod) | **PUT** /v1/employees/{employee_id}/payment_method | Update an employee&#39;s payment method |


<a name="createBankAccount"></a>
# **createBankAccount**
> EmployeeBankAccount createBankAccount(employeeId).xGustoAPIVersion(xGustoAPIVersion).employeePaymentMethodCreateBankAccountRequest(employeePaymentMethodCreateBankAccountRequest).execute();

Create an employee bank account

Creates an employee bank account. An employee can have multiple bank accounts. Note that creating an employee bank account will also update the employee&#39;s payment method.  scope: &#x60;employee_payment_methods:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePaymentMethodApi;
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
    String employeeId = "employeeId_example"; // The UUID of the employee
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      EmployeeBankAccount result = client
              .employeePaymentMethod
              .createBankAccount(name, routingNumber, accountNumber, accountType, employeeId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getEmployeeUuid());
      System.out.println(result.getAccountType());
      System.out.println(result.getName());
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getHiddenAccountNumber());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePaymentMethodApi#createBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeBankAccount> response = client
              .employeePaymentMethod
              .createBankAccount(name, routingNumber, accountNumber, accountType, employeeId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePaymentMethodApi#createBankAccount");
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
| **employeeId** | **String**| The UUID of the employee | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **employeePaymentMethodCreateBankAccountRequest** | [**EmployeePaymentMethodCreateBankAccountRequest**](EmployeePaymentMethodCreateBankAccountRequest.md)|  | [optional] |

### Return type

[**EmployeeBankAccount**](EmployeeBankAccount.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="deleteBankAccount"></a>
# **deleteBankAccount**
> deleteBankAccount(employeeId, bankAccountUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Delete an employee bank account

Deletes an employee bank account. To update an employee&#39;s bank account details, delete the bank account first and create a new one.  scope: &#x60;employee_payment_methods:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePaymentMethodApi;
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
    String employeeId = "employeeId_example"; // The UUID of the employee
    String bankAccountUuid = "bankAccountUuid_example"; // The UUID of the bank account
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .employeePaymentMethod
              .deleteBankAccount(employeeId, bankAccountUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePaymentMethodApi#deleteBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employeePaymentMethod
              .deleteBankAccount(employeeId, bankAccountUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePaymentMethodApi#deleteBankAccount");
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
| **employeeId** | **String**| The UUID of the employee | |
| **bankAccountUuid** | **String**| The UUID of the bank account | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getBankAccounts"></a>
# **getBankAccounts**
> EmployeePaymentMethod getBankAccounts(employeeId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get an employee&#39;s payment method

Fetches an employee&#39;s payment method. An employee payment method describes how the payment should be split across the employee&#39;s associated bank accounts.  scope: &#x60;employee_payment_methods:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePaymentMethodApi;
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
    String employeeId = "employeeId_example"; // The UUID of the employee
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      EmployeePaymentMethod result = client
              .employeePaymentMethod
              .getBankAccounts(employeeId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getType());
      System.out.println(result.getSplitBy());
      System.out.println(result.getSplits());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePaymentMethodApi#getBankAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeePaymentMethod> response = client
              .employeePaymentMethod
              .getBankAccounts(employeeId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePaymentMethodApi#getBankAccounts");
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
| **employeeId** | **String**| The UUID of the employee | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**EmployeePaymentMethod**](EmployeePaymentMethod.md)

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
> List&lt;EmployeeBankAccount&gt; listBankAccounts(employeeId).page(page).per(per).xGustoAPIVersion(xGustoAPIVersion).body(body).execute();

Get all employee bank accounts

Returns all employee bank accounts.  scope: &#x60;employee_payment_methods:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePaymentMethodApi;
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
    String employeeId = "employeeId_example"; // The UUID of the employee
    Double page = 3.4D; // The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
    Double per = 3.4D; // Number of objects per page. For majority of endpoints will default to 25
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<EmployeeBankAccount> result = client
              .employeePaymentMethod
              .listBankAccounts(employeeId)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePaymentMethodApi#listBankAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeBankAccount>> response = client
              .employeePaymentMethod
              .listBankAccounts(employeeId)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePaymentMethodApi#listBankAccounts");
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
| **employeeId** | **String**| The UUID of the employee | |
| **page** | **Double**| The page that is requested. When unspecified, will load all objects unless endpoint forces pagination. | [optional] |
| **per** | **Double**| Number of objects per page. For majority of endpoints will default to 25 | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **body** | **Object**|  | [optional] |

### Return type

[**List&lt;EmployeeBankAccount&gt;**](EmployeeBankAccount.md)

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

<a name="updatePaymentMethod"></a>
# **updatePaymentMethod**
> EmployeePaymentMethod updatePaymentMethod(employeeId).xGustoAPIVersion(xGustoAPIVersion).employeePaymentMethodUpdatePaymentMethodRequest(employeePaymentMethodUpdatePaymentMethodRequest).execute();

Update an employee&#39;s payment method

Updates an employee&#39;s payment method. Note that creating an employee bank account will also update the employee&#39;s payment method.  scope: &#x60;employee_payment_methods:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePaymentMethodApi;
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
    String version = "version_example"; // The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
    String type = "Direct Deposit"; // The payment method type. If type is Check, then split_by and splits do not need to be populated. If type is Direct Deposit, split_by and splits are required.
    String employeeId = "employeeId_example"; // The UUID of the employee
    String splitBy = "Amount"; // Describes how the payment will be split. If split_by is Percentage, then the split amounts must add up to exactly 100. If split_by is Amount, then the last split amount must be nil to capture the remainder.
    List<EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner> splits = Arrays.asList();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      EmployeePaymentMethod result = client
              .employeePaymentMethod
              .updatePaymentMethod(version, type, employeeId)
              .splitBy(splitBy)
              .splits(splits)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getType());
      System.out.println(result.getSplitBy());
      System.out.println(result.getSplits());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePaymentMethodApi#updatePaymentMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeePaymentMethod> response = client
              .employeePaymentMethod
              .updatePaymentMethod(version, type, employeeId)
              .splitBy(splitBy)
              .splits(splits)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePaymentMethodApi#updatePaymentMethod");
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
| **employeeId** | **String**| The UUID of the employee | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **employeePaymentMethodUpdatePaymentMethodRequest** | [**EmployeePaymentMethodUpdatePaymentMethodRequest**](EmployeePaymentMethodUpdatePaymentMethodRequest.md)|  | [optional] |

### Return type

[**EmployeePaymentMethod**](EmployeePaymentMethod.md)

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

