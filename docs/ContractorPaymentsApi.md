# ContractorPaymentsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelPayment**](ContractorPaymentsApi.md#cancelPayment) | **DELETE** /v1/companies/{company_id}/contractor_payments/{contractor_payment_id} | Cancel a contractor payment |
| [**createPayment**](ContractorPaymentsApi.md#createPayment) | **POST** /v1/companies/{company_id}/contractor_payments | Create a contractor payment |
| [**fundContractorPayment**](ContractorPaymentsApi.md#fundContractorPayment) | **PUT** /v1/contractor_payments/{contractor_payment_uuid}/fund | Fund a contractor payment [DEMO] |
| [**getSinglePayment**](ContractorPaymentsApi.md#getSinglePayment) | **GET** /v1/companies/{company_id}/contractor_payments/{contractor_payment_id} | Get a single contractor payment |
| [**getSingleReceipt**](ContractorPaymentsApi.md#getSingleReceipt) | **GET** /v1/contractor_payments/{contractor_payment_uuid}/receipt | Get a single contractor payment receipt |
| [**getWithinTimePeriodTotals**](ContractorPaymentsApi.md#getWithinTimePeriodTotals) | **GET** /v1/companies/{company_id}/contractor_payments | Get contractor payments for a company |
| [**previewDebitDate**](ContractorPaymentsApi.md#previewDebitDate) | **GET** /v1/companies/{company_uuid}/contractor_payments/preview | Preview contractor payment debit date |


<a name="cancelPayment"></a>
# **cancelPayment**
> cancelPayment(companyId, contractorPaymentId).xGustoAPIVersion(xGustoAPIVersion).execute();

Cancel a contractor payment

Cancels and deletes a contractor payment. If the contractor payment has already started processing, the payment cannot be cancelled.  scope: &#x60;payrolls:run&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorPaymentsApi;
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
    String contractorPaymentId = "contractorPaymentId_example"; // The UUID of the contractor payment
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .contractorPayments
              .cancelPayment(companyId, contractorPaymentId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentsApi#cancelPayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .contractorPayments
              .cancelPayment(companyId, contractorPaymentId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentsApi#cancelPayment");
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
| **contractorPaymentId** | **String**| The UUID of the contractor payment | |
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

<a name="createPayment"></a>
# **createPayment**
> ContractorPayment createPayment(companyId).xGustoAPIVersion(xGustoAPIVersion).contractorPaymentsCreatePaymentRequest(contractorPaymentsCreatePaymentRequest).execute();

Create a contractor payment

Pay a contractor. Information needed depends on the contractor&#39;s wage type (hourly vs fixed)  scope: &#x60;payrolls:run&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorPaymentsApi;
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
    String contractorUuid = "contractorUuid_example"; // The contractor receiving the payment
    LocalDate date = LocalDate.now(); // The contractor receiving the payment
    String companyId = "companyId_example"; // The UUID of the company
    String paymentMethod = "Direct Deposit";
    Double wage = 3.4D; // If the contractor is on a fixed wage, this is the fixed wage payment for the contractor, regardless of hours worked
    Double hours = 3.4D; // If the contractor is on an hourly wage, this is the number of hours that the contractor worked for the payment
    Double bonus = 3.4D; // If the contractor is on an hourly wage, this is the bonus the contractor earned
    Double reimbursement = 3.4D; // Reimbursed wages for the contractor
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      ContractorPayment result = client
              .contractorPayments
              .createPayment(contractorUuid, date, companyId)
              .paymentMethod(paymentMethod)
              .wage(wage)
              .hours(hours)
              .bonus(bonus)
              .reimbursement(reimbursement)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getContractorUuid());
      System.out.println(result.getBonus());
      System.out.println(result.getDate());
      System.out.println(result.getHours());
      System.out.println(result.getPaymentMethod());
      System.out.println(result.getReimbursement());
      System.out.println(result.getStatus());
      System.out.println(result.getHourlyRate());
      System.out.println(result.getMayCancel());
      System.out.println(result.getWage());
      System.out.println(result.getWageType());
      System.out.println(result.getWageTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentsApi#createPayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractorPayment> response = client
              .contractorPayments
              .createPayment(contractorUuid, date, companyId)
              .paymentMethod(paymentMethod)
              .wage(wage)
              .hours(hours)
              .bonus(bonus)
              .reimbursement(reimbursement)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentsApi#createPayment");
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
| **contractorPaymentsCreatePaymentRequest** | [**ContractorPaymentsCreatePaymentRequest**](ContractorPaymentsCreatePaymentRequest.md)|  | [optional] |

### Return type

[**ContractorPayment**](ContractorPayment.md)

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

<a name="fundContractorPayment"></a>
# **fundContractorPayment**
> ContractorPayment fundContractorPayment(contractorPaymentUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Fund a contractor payment [DEMO]

&gt; 🚧 Demo action &gt; &gt; This action is only available in the Demo environment  Simulate funding a contractor payment. Funding only occurs automatically in the production environment when bank transactions are generated. Use this action in the demo environment to transition a contractor payment&#39;s &#x60;status&#x60; from &#x60;Unfunded&#x60; to &#x60;Funded&#x60;. A &#x60;Funded&#x60; status is required for generating a contractor payment receipt.  scope: &#x60;payrolls:run&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorPaymentsApi;
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
    String contractorPaymentUuid = "contractorPaymentUuid_example"; // The UUID of the contractor payment
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      ContractorPayment result = client
              .contractorPayments
              .fundContractorPayment(contractorPaymentUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getContractorUuid());
      System.out.println(result.getBonus());
      System.out.println(result.getDate());
      System.out.println(result.getHours());
      System.out.println(result.getPaymentMethod());
      System.out.println(result.getReimbursement());
      System.out.println(result.getStatus());
      System.out.println(result.getHourlyRate());
      System.out.println(result.getMayCancel());
      System.out.println(result.getWage());
      System.out.println(result.getWageType());
      System.out.println(result.getWageTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentsApi#fundContractorPayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractorPayment> response = client
              .contractorPayments
              .fundContractorPayment(contractorPaymentUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentsApi#fundContractorPayment");
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
| **contractorPaymentUuid** | **String**| The UUID of the contractor payment | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**ContractorPayment**](ContractorPayment.md)

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

<a name="getSinglePayment"></a>
# **getSinglePayment**
> ContractorPayment getSinglePayment(companyId, contractorPaymentId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a single contractor payment

Returns a single contractor payments  scope: &#x60;payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorPaymentsApi;
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
    String contractorPaymentId = "contractorPaymentId_example"; // The UUID of the contractor payment
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      ContractorPayment result = client
              .contractorPayments
              .getSinglePayment(companyId, contractorPaymentId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getContractorUuid());
      System.out.println(result.getBonus());
      System.out.println(result.getDate());
      System.out.println(result.getHours());
      System.out.println(result.getPaymentMethod());
      System.out.println(result.getReimbursement());
      System.out.println(result.getStatus());
      System.out.println(result.getHourlyRate());
      System.out.println(result.getMayCancel());
      System.out.println(result.getWage());
      System.out.println(result.getWageType());
      System.out.println(result.getWageTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentsApi#getSinglePayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractorPayment> response = client
              .contractorPayments
              .getSinglePayment(companyId, contractorPaymentId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentsApi#getSinglePayment");
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
| **contractorPaymentId** | **String**| The UUID of the contractor payment | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**ContractorPayment**](ContractorPayment.md)

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

<a name="getSingleReceipt"></a>
# **getSingleReceipt**
> ContractorPaymentReceipt getSingleReceipt(contractorPaymentUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a single contractor payment receipt

Returns a contractor payment receipt.  Notes: * Receipts are only available for direct deposit payments and are only available once those payments have been funded. * Payroll Receipt requests for payrolls which do not have receipts available (e.g. payment by check) will return a 404 status. * Hour and dollar amounts are returned as string representations of numeric decimals. * Dollar amounts are represented to the cent. * If no data has yet be inserted for a given field, it defaults to “0.00” (for fixed amounts).  scope: &#x60;payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorPaymentsApi;
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
    String contractorPaymentUuid = "contractorPaymentUuid_example"; // The UUID of the contractor payment
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      ContractorPaymentReceipt result = client
              .contractorPayments
              .getSingleReceipt(contractorPaymentUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getContractorPaymentUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getNameOfSender());
      System.out.println(result.getNameOfRecipient());
      System.out.println(result.getDebitDate());
      System.out.println(result.getLicense());
      System.out.println(result.getLicenseUri());
      System.out.println(result.getRightToRefund());
      System.out.println(result.getLiabilityOfLicensee());
      System.out.println(result.getTotals());
      System.out.println(result.getContractorPayments());
      System.out.println(result.getLicensee());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentsApi#getSingleReceipt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractorPaymentReceipt> response = client
              .contractorPayments
              .getSingleReceipt(contractorPaymentUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentsApi#getSingleReceipt");
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
| **contractorPaymentUuid** | **String**| The UUID of the contractor payment | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**ContractorPaymentReceipt**](ContractorPaymentReceipt.md)

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

<a name="getWithinTimePeriodTotals"></a>
# **getWithinTimePeriodTotals**
> Object getWithinTimePeriodTotals(companyId, startDate, endDate).contractorUuid(contractorUuid).groupByDate(groupByDate).page(page).per(per).xGustoAPIVersion(xGustoAPIVersion).execute();

Get contractor payments for a company

Returns an object containing individual contractor payments, within a given time period, including totals.  scope: &#x60;payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorPaymentsApi;
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
    String startDate = "2020-01-01"; // The time period for which to retrieve contractor payments
    String endDate = "2020-12-31"; // The time period for which to retrieve contractor payments
    String contractorUuid = "contractorUuid_example"; // The UUID of the contractor. When specified, will load all payments for that contractor.
    Boolean groupByDate = true; // Display contractor payments results group by check date if set to true.
    Double page = 3.4D; // The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
    Double per = 3.4D; // Number of objects per page. For majority of endpoints will default to 25
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Object result = client
              .contractorPayments
              .getWithinTimePeriodTotals(companyId, startDate, endDate)
              .contractorUuid(contractorUuid)
              .groupByDate(groupByDate)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentsApi#getWithinTimePeriodTotals");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .contractorPayments
              .getWithinTimePeriodTotals(companyId, startDate, endDate)
              .contractorUuid(contractorUuid)
              .groupByDate(groupByDate)
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
      System.err.println("Exception when calling ContractorPaymentsApi#getWithinTimePeriodTotals");
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
| **startDate** | **String**| The time period for which to retrieve contractor payments | |
| **endDate** | **String**| The time period for which to retrieve contractor payments | |
| **contractorUuid** | **String**| The UUID of the contractor. When specified, will load all payments for that contractor. | [optional] |
| **groupByDate** | **Boolean**| Display contractor payments results group by check date if set to true. | [optional] |
| **page** | **Double**| The page that is requested. When unspecified, will load all objects unless endpoint forces pagination. | [optional] |
| **per** | **Double**| Number of objects per page. For majority of endpoints will default to 25 | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object containing contractor payments information |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="previewDebitDate"></a>
# **previewDebitDate**
> ContractorPaymentsPreviewDebitDateResponse previewDebitDate(companyUuid).xGustoAPIVersion(xGustoAPIVersion).contractorPaymentsPreviewDebitDateRequest(contractorPaymentsPreviewDebitDateRequest).execute();

Preview contractor payment debit date

Returns a debit_date dependent on the ACH payment speed of the company.  If the payment method is Check or Historical payment, the debit_date will be the same as the check_date.  scope: &#x60;payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorPaymentsApi;
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
    List<ContractorPaymentsPreviewDebitDateRequestContractorPaymentsInner> contractorPayments = Arrays.asList();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      ContractorPaymentsPreviewDebitDateResponse result = client
              .contractorPayments
              .previewDebitDate(companyUuid)
              .contractorPayments(contractorPayments)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getExpectedDebitDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentsApi#previewDebitDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractorPaymentsPreviewDebitDateResponse> response = client
              .contractorPayments
              .previewDebitDate(companyUuid)
              .contractorPayments(contractorPayments)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentsApi#previewDebitDate");
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
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **contractorPaymentsPreviewDebitDateRequest** | [**ContractorPaymentsPreviewDebitDateRequest**](ContractorPaymentsPreviewDebitDateRequest.md)| a list of contractor payments. | [optional] |

### Return type

[**ContractorPaymentsPreviewDebitDateResponse**](ContractorPaymentsPreviewDebitDateResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

