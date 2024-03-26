# BankAccountsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFromPlaidToken**](BankAccountsApi.md#createFromPlaidToken) | **POST** /v1/plaid/processor_token | Create a bank account from a plaid processor token |
| [**createVerificationDeposits**](BankAccountsApi.md#createVerificationDeposits) | **POST** /v1/companies/{company_id}/bank_accounts | Create a company bank account |
| [**listCompanyBankAccounts**](BankAccountsApi.md#listCompanyBankAccounts) | **GET** /v1/companies/{company_id}/bank_accounts | Get all company bank accounts |
| [**verifyMicroDeposits**](BankAccountsApi.md#verifyMicroDeposits) | **PUT** /v1/companies/{company_id}/bank_accounts/{bank_account_uuid}/verify | Verify a company bank account |


<a name="createFromPlaidToken"></a>
# **createFromPlaidToken**
> Object createFromPlaidToken().xGustoAPIVersion(xGustoAPIVersion).bankAccountsCreateFromPlaidTokenRequest(bankAccountsCreateFromPlaidTokenRequest).execute();

Create a bank account from a plaid processor token

This endpoint creates a new **verified** bank account by using a plaid processor token to retrieve its information.  scope: &#x60;plaid_processor:write&#x60;  &gt; 📘 &gt; To create a token please use the [plaid api](https://plaid.com/docs/api/processors/#processortokencreate) and select \&quot;gusto\&quot; as processor.  &gt; 🚧 Warning - Company Bank Accounts &gt; &gt; If a default company bank account exists, it will be disabled and the new bank account will replace it as the company&#39;s default funding method.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankAccountsApi;
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
    String ownerType = "Company"; // The owner type of the bank account
    String ownerId = "ownerId_example"; // The owner uuid of the bank account
    String processorToken = "processorToken_example"; // The Plaid processor token
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Object result = client
              .bankAccounts
              .createFromPlaidToken(ownerType, ownerId, processorToken)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#createFromPlaidToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .bankAccounts
              .createFromPlaidToken(ownerType, ownerId, processorToken)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#createFromPlaidToken");
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
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **bankAccountsCreateFromPlaidTokenRequest** | [**BankAccountsCreateFromPlaidTokenRequest**](BankAccountsCreateFromPlaidTokenRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A JSON object containing bank information |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="createVerificationDeposits"></a>
# **createVerificationDeposits**
> CompanyBankAccount createVerificationDeposits(companyId).xGustoAPIVersion(xGustoAPIVersion).bankAccountsCreateVerificationDepositsRequest(bankAccountsCreateVerificationDepositsRequest).execute();

Create a company bank account

This endpoint creates a new company bank account.  Upon being created, two verification deposits are automatically sent to the bank account, and the bank account&#39;s verification_status is &#39;awaiting_deposits&#39;.   When the deposits are successfully transferred, the verification_status changes to &#39;ready_for_verification&#39;, at which point the verify endpoint can be used to verify the bank account. After successful verification, the bank account&#39;s verification_status is &#39;verified&#39;.  scope: &#x60;company_bank_accounts:write&#x60;  &gt; 🚧 Warning &gt; &gt; If a default bank account exists, it will be disabled and the new bank account will replace it as the company&#39;s default funding method.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankAccountsApi;
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
    String companyId = "companyId_example"; // The UUID of the company
    String routingNumber = "routingNumber_example"; // The bank routing number
    String accountNumber = "accountNumber_example"; // The bank account number
    String accountType = "Checking"; // The bank account type
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      CompanyBankAccount result = client
              .bankAccounts
              .createVerificationDeposits(companyId)
              .routingNumber(routingNumber)
              .accountNumber(accountNumber)
              .accountType(accountType)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getAccountType());
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getHiddenAccountNumber());
      System.out.println(result.getVerificationStatus());
      System.out.println(result.getVerificationType());
      System.out.println(result.getPlaidStatus());
      System.out.println(result.getLastCachedBalance());
      System.out.println(result.getBalanceFetchedDate());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#createVerificationDeposits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyBankAccount> response = client
              .bankAccounts
              .createVerificationDeposits(companyId)
              .routingNumber(routingNumber)
              .accountNumber(accountNumber)
              .accountType(accountType)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#createVerificationDeposits");
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
| **companyId** | **String**| The UUID of the company | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **bankAccountsCreateVerificationDepositsRequest** | [**BankAccountsCreateVerificationDepositsRequest**](BankAccountsCreateVerificationDepositsRequest.md)|  | [optional] |

### Return type

[**CompanyBankAccount**](CompanyBankAccount.md)

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

<a name="listCompanyBankAccounts"></a>
# **listCompanyBankAccounts**
> List&lt;CompanyBankAccount&gt; listCompanyBankAccounts(companyId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get all company bank accounts

Returns company bank accounts. Currently, we only support a single default bank account per company.  scope: &#x60;company_bank_accounts:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankAccountsApi;
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
    String companyId = "companyId_example"; // The UUID of the company
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<CompanyBankAccount> result = client
              .bankAccounts
              .listCompanyBankAccounts(companyId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#listCompanyBankAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CompanyBankAccount>> response = client
              .bankAccounts
              .listCompanyBankAccounts(companyId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#listCompanyBankAccounts");
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
| **companyId** | **String**| The UUID of the company | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**List&lt;CompanyBankAccount&gt;**](CompanyBankAccount.md)

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

<a name="verifyMicroDeposits"></a>
# **verifyMicroDeposits**
> CompanyBankAccount verifyMicroDeposits(bankAccountUuid, companyId).xGustoAPIVersion(xGustoAPIVersion).bankAccountsVerifyMicroDepositsRequest(bankAccountsVerifyMicroDepositsRequest).execute();

Verify a company bank account

Verify a company bank account by confirming the two micro-deposits sent to the bank account. Note that the order of the two deposits specified in request parameters does not matter. There&#39;s a maximum of 5 verification attempts, after which we will automatically initiate a new set of micro-deposits and require the bank account to be verified with the new micro-deposits.  ### Bank account verification in demo  We provide the endpoint &#x60;POST &#39;/v1/companies/{company_id}/bank_accounts/{bank_account_uuid}/send_test_deposits&#39;&#x60; to facilitate bank account verification in the demo environment. This endpoint simulates the micro-deposits transfer and returns them in the response. You can call this endpoint as many times as you wish to retrieve the values of the two micro deposits.  &#x60;&#x60;&#x60;   POST &#39;/v1/companies/89771af8-b964-472e-8064-554dfbcb56d9/bank_accounts/ade55e57-4800-4059-9ecd-fa29cfeb6dd2/send_test_deposits&#39;    {     \&quot;deposit_1\&quot;: 0.02,     \&quot;deposit_2\&quot;: 0.42   } &#x60;&#x60;&#x60;  scope: &#x60;company_bank_accounts:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankAccountsApi;
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
    String bankAccountUuid = "bankAccountUuid_example"; // The UUID of the bank account
    String companyId = "companyId_example"; // The UUID of the company
    Double deposit1 = 3.4D; // The dollar amount of the first micro-deposit
    Double deposit2 = 3.4D; // The dollar amount of the second micro-deposit
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      CompanyBankAccount result = client
              .bankAccounts
              .verifyMicroDeposits(bankAccountUuid, companyId)
              .deposit1(deposit1)
              .deposit2(deposit2)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getAccountType());
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getHiddenAccountNumber());
      System.out.println(result.getVerificationStatus());
      System.out.println(result.getVerificationType());
      System.out.println(result.getPlaidStatus());
      System.out.println(result.getLastCachedBalance());
      System.out.println(result.getBalanceFetchedDate());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#verifyMicroDeposits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyBankAccount> response = client
              .bankAccounts
              .verifyMicroDeposits(bankAccountUuid, companyId)
              .deposit1(deposit1)
              .deposit2(deposit2)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#verifyMicroDeposits");
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
| **bankAccountUuid** | **String**| The UUID of the bank account | |
| **companyId** | **String**| The UUID of the company | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **bankAccountsVerifyMicroDepositsRequest** | [**BankAccountsVerifyMicroDepositsRequest**](BankAccountsVerifyMicroDepositsRequest.md)|  | [optional] |

### Return type

[**CompanyBankAccount**](CompanyBankAccount.md)

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

