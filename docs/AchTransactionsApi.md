# AchTransactionsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllForCompany**](AchTransactionsApi.md#getAllForCompany) | **GET** /v1/companies/{company_uuid}/ach_transactions | Get all ACH transactions for a company |


<a name="getAllForCompany"></a>
# **getAllForCompany**
> List&lt;AchTransaction&gt; getAllForCompany(companyUuid).contractorPaymentUuid(contractorPaymentUuid).payrollUuid(payrollUuid).transactionType(transactionType).paymentDirection(paymentDirection).xGustoAPIVersion(xGustoAPIVersion).execute();

Get all ACH transactions for a company

Fetches all ACH transactions for a company.  scope: &#x60;ach_transactions:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AchTransactionsApi;
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
    String companyUuid = "companyUuid_example"; // The UUID of the company
    String contractorPaymentUuid = "contractorPaymentUuid_example"; // The UUID of the contractor payment
    String payrollUuid = "payrollUuid_example"; // The UUID of the payroll
    String transactionType = "transactionType_example"; // Used to filter the ACH transactions to only include those with a specific transaction type, such as \"Credit employee pay\".
    String paymentDirection = "paymentDirection_example"; // Used to filter the ACH transactions to only include those with a specific payment direction, either \"credit\" or \"debit\".
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<AchTransaction> result = client
              .achTransactions
              .getAllForCompany(companyUuid)
              .contractorPaymentUuid(contractorPaymentUuid)
              .payrollUuid(payrollUuid)
              .transactionType(transactionType)
              .paymentDirection(paymentDirection)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AchTransactionsApi#getAllForCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AchTransaction>> response = client
              .achTransactions
              .getAllForCompany(companyUuid)
              .contractorPaymentUuid(contractorPaymentUuid)
              .payrollUuid(payrollUuid)
              .transactionType(transactionType)
              .paymentDirection(paymentDirection)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AchTransactionsApi#getAllForCompany");
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
| **companyUuid** | **String**| The UUID of the company | |
| **contractorPaymentUuid** | **String**| The UUID of the contractor payment | [optional] |
| **payrollUuid** | **String**| The UUID of the payroll | [optional] |
| **transactionType** | **String**| Used to filter the ACH transactions to only include those with a specific transaction type, such as \&quot;Credit employee pay\&quot;. | [optional] |
| **paymentDirection** | **String**| Used to filter the ACH transactions to only include those with a specific payment direction, either \&quot;credit\&quot; or \&quot;debit\&quot;. | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**List&lt;AchTransaction&gt;**](AchTransaction.md)

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

