# ExternalPayrollsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewPayroll**](ExternalPayrollsApi.md#createNewPayroll) | **POST** /v1/companies/{company_uuid}/external_payrolls | Create a new external payroll for a company |
| [**deletePayroll**](ExternalPayrollsApi.md#deletePayroll) | **DELETE** /v1/companies/{company_uuid}/external_payrolls/{external_payroll_id} | Delete an external payroll |
| [**finalizeTaxLiabilities**](ExternalPayrollsApi.md#finalizeTaxLiabilities) | **PUT** /v1/companies/{company_uuid}/external_payrolls/tax_liabilities/finish | Finalize tax liabilities options and convert into processed payrolls |
| [**getById**](ExternalPayrollsApi.md#getById) | **GET** /v1/companies/{company_uuid}/external_payrolls/{external_payroll_id} | Get an external payroll |
| [**getTaxLiabilities**](ExternalPayrollsApi.md#getTaxLiabilities) | **GET** /v1/companies/{company_uuid}/external_payrolls/tax_liabilities | Get tax liabilities |
| [**getTaxSuggestions**](ExternalPayrollsApi.md#getTaxSuggestions) | **GET** /v1/companies/{company_uuid}/external_payrolls/{external_payroll_id}/calculate_taxes | Get tax suggestions for an external payroll |
| [**listForCompany**](ExternalPayrollsApi.md#listForCompany) | **GET** /v1/companies/{company_uuid}/external_payrolls | Get external payrolls for a company |
| [**updatePayrollItems**](ExternalPayrollsApi.md#updatePayrollItems) | **PUT** /v1/companies/{company_uuid}/external_payrolls/{external_payroll_id} | Update an external payroll |
| [**updateTaxLiabilities**](ExternalPayrollsApi.md#updateTaxLiabilities) | **PUT** /v1/companies/{company_uuid}/external_payrolls/tax_liabilities | Update tax liabilities |


<a name="createNewPayroll"></a>
# **createNewPayroll**
> ExternalPayroll createNewPayroll(companyUuid).xGustoAPIVersion(xGustoAPIVersion).externalPayrollsCreateNewPayrollRequest(externalPayrollsCreateNewPayrollRequest).execute();

Create a new external payroll for a company

Creates a new external payroll for the company.  scope: &#x60;external_payrolls:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExternalPayrollsApi;
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
    String checkDate = "checkDate_example"; // External payroll's check date.
    String paymentPeriodStartDate = "paymentPeriodStartDate_example"; // External payroll's pay period start date.
    String paymentPeriodEndDate = "paymentPeriodEndDate_example"; // External payroll's pay period end date.
    String companyUuid = "companyUuid_example"; // The UUID of the company
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      ExternalPayroll result = client
              .externalPayrolls
              .createNewPayroll(checkDate, paymentPeriodStartDate, paymentPeriodEndDate, companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getCheckDate());
      System.out.println(result.getPaymentPeriodStartDate());
      System.out.println(result.getPaymentPeriodEndDate());
      System.out.println(result.getStatus());
      System.out.println(result.getExternalPayrollItems());
      System.out.println(result.getApplicableEarnings());
      System.out.println(result.getApplicableBenefits());
      System.out.println(result.getApplicableTaxes());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#createNewPayroll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExternalPayroll> response = client
              .externalPayrolls
              .createNewPayroll(checkDate, paymentPeriodStartDate, paymentPeriodEndDate, companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#createNewPayroll");
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
| **externalPayrollsCreateNewPayrollRequest** | [**ExternalPayrollsCreateNewPayrollRequest**](ExternalPayrollsCreateNewPayrollRequest.md)|  | [optional] |

### Return type

[**ExternalPayroll**](ExternalPayroll.md)

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

<a name="deletePayroll"></a>
# **deletePayroll**
> deletePayroll(companyUuid, externalPayrollId).xGustoAPIVersion(xGustoAPIVersion).execute();

Delete an external payroll

Delete an external payroll.  scope: &#x60;external_payrolls:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExternalPayrollsApi;
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
    String externalPayrollId = "externalPayrollId_example"; // The UUID of the external payroll
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .externalPayrolls
              .deletePayroll(companyUuid, externalPayrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#deletePayroll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .externalPayrolls
              .deletePayroll(companyUuid, externalPayrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#deletePayroll");
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
| **externalPayrollId** | **String**| The UUID of the external payroll | |
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

<a name="finalizeTaxLiabilities"></a>
# **finalizeTaxLiabilities**
> finalizeTaxLiabilities(companyUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Finalize tax liabilities options and convert into processed payrolls

Finalizes tax liabilities for a company. All external payrolls edit action will be disabled.  scope: &#x60;external_payrolls:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExternalPayrollsApi;
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
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .externalPayrolls
              .finalizeTaxLiabilities(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#finalizeTaxLiabilities");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .externalPayrolls
              .finalizeTaxLiabilities(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#finalizeTaxLiabilities");
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

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getById"></a>
# **getById**
> ExternalPayroll getById(companyUuid, externalPayrollId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get an external payroll

Get an external payroll for a given company.  scope: &#x60;external_payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExternalPayrollsApi;
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
    String externalPayrollId = "externalPayrollId_example"; // The UUID of the external payroll
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      ExternalPayroll result = client
              .externalPayrolls
              .getById(companyUuid, externalPayrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getCheckDate());
      System.out.println(result.getPaymentPeriodStartDate());
      System.out.println(result.getPaymentPeriodEndDate());
      System.out.println(result.getStatus());
      System.out.println(result.getExternalPayrollItems());
      System.out.println(result.getApplicableEarnings());
      System.out.println(result.getApplicableBenefits());
      System.out.println(result.getApplicableTaxes());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExternalPayroll> response = client
              .externalPayrolls
              .getById(companyUuid, externalPayrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#getById");
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
| **externalPayrollId** | **String**| The UUID of the external payroll | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**ExternalPayroll**](ExternalPayroll.md)

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

<a name="getTaxLiabilities"></a>
# **getTaxLiabilities**
> List&lt;TaxLiabilitiesSelections&gt; getTaxLiabilities(companyUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get tax liabilities

Get tax liabilities from aggregate external payrolls for a company.  scope: &#x60;external_payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExternalPayrollsApi;
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
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<TaxLiabilitiesSelections> result = client
              .externalPayrolls
              .getTaxLiabilities(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#getTaxLiabilities");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TaxLiabilitiesSelections>> response = client
              .externalPayrolls
              .getTaxLiabilities(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#getTaxLiabilities");
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

### Return type

[**List&lt;TaxLiabilitiesSelections&gt;**](TaxLiabilitiesSelections.md)

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

<a name="getTaxSuggestions"></a>
# **getTaxSuggestions**
> List&lt;ExternalPayrollTaxSuggestions&gt; getTaxSuggestions(companyUuid, externalPayrollId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get tax suggestions for an external payroll

Get tax suggestions for an external payroll. Earnings and/or benefits data must be saved prior to the calculation in order to retrieve accurate tax calculation.  scope: &#x60;external_payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExternalPayrollsApi;
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
    String externalPayrollId = "externalPayrollId_example"; // The UUID of the external payroll
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<ExternalPayrollTaxSuggestions> result = client
              .externalPayrolls
              .getTaxSuggestions(companyUuid, externalPayrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#getTaxSuggestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ExternalPayrollTaxSuggestions>> response = client
              .externalPayrolls
              .getTaxSuggestions(companyUuid, externalPayrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#getTaxSuggestions");
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
| **externalPayrollId** | **String**| The UUID of the external payroll | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**List&lt;ExternalPayrollTaxSuggestions&gt;**](ExternalPayrollTaxSuggestions.md)

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

<a name="listForCompany"></a>
# **listForCompany**
> List&lt;ExternalPayrollBasic&gt; listForCompany(companyUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get external payrolls for a company

Get an external payroll for a given company.  scope: &#x60;external_payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExternalPayrollsApi;
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
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<ExternalPayrollBasic> result = client
              .externalPayrolls
              .listForCompany(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#listForCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ExternalPayrollBasic>> response = client
              .externalPayrolls
              .listForCompany(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#listForCompany");
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

### Return type

[**List&lt;ExternalPayrollBasic&gt;**](ExternalPayrollBasic.md)

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

<a name="updatePayrollItems"></a>
# **updatePayrollItems**
> ExternalPayroll updatePayrollItems(companyUuid, externalPayrollId).xGustoAPIVersion(xGustoAPIVersion).externalPayrollsUpdatePayrollItemsRequest(externalPayrollsUpdatePayrollItemsRequest).execute();

Update an external payroll

Update an external payroll with a list of external payroll items  scope: &#x60;external_payrolls:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExternalPayrollsApi;
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
    String externalPayrollId = "externalPayrollId_example"; // The UUID of the external payroll
    Boolean replaceFields = true; // Patch update external payroll items when set to true, otherwise it will overwrite the previous changes.
    List<ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInner> externalPayrollItems = Arrays.asList();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      ExternalPayroll result = client
              .externalPayrolls
              .updatePayrollItems(companyUuid, externalPayrollId)
              .replaceFields(replaceFields)
              .externalPayrollItems(externalPayrollItems)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getCheckDate());
      System.out.println(result.getPaymentPeriodStartDate());
      System.out.println(result.getPaymentPeriodEndDate());
      System.out.println(result.getStatus());
      System.out.println(result.getExternalPayrollItems());
      System.out.println(result.getApplicableEarnings());
      System.out.println(result.getApplicableBenefits());
      System.out.println(result.getApplicableTaxes());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#updatePayrollItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExternalPayroll> response = client
              .externalPayrolls
              .updatePayrollItems(companyUuid, externalPayrollId)
              .replaceFields(replaceFields)
              .externalPayrollItems(externalPayrollItems)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#updatePayrollItems");
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
| **externalPayrollId** | **String**| The UUID of the external payroll | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **externalPayrollsUpdatePayrollItemsRequest** | [**ExternalPayrollsUpdatePayrollItemsRequest**](ExternalPayrollsUpdatePayrollItemsRequest.md)|  | [optional] |

### Return type

[**ExternalPayroll**](ExternalPayroll.md)

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

<a name="updateTaxLiabilities"></a>
# **updateTaxLiabilities**
> List&lt;TaxLiabilitiesSelections&gt; updateTaxLiabilities(companyUuid).xGustoAPIVersion(xGustoAPIVersion).externalPayrollsUpdateTaxLiabilitiesRequest(externalPayrollsUpdateTaxLiabilitiesRequest).execute();

Update tax liabilities

Update tax liabilities for a company.  scope: &#x60;external_payrolls:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExternalPayrollsApi;
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
    List<ExternalPayrollsUpdateTaxLiabilitiesRequestLiabilitySelectionsInner> liabilitySelections = Arrays.asList();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<TaxLiabilitiesSelections> result = client
              .externalPayrolls
              .updateTaxLiabilities(companyUuid)
              .liabilitySelections(liabilitySelections)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#updateTaxLiabilities");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TaxLiabilitiesSelections>> response = client
              .externalPayrolls
              .updateTaxLiabilities(companyUuid)
              .liabilitySelections(liabilitySelections)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalPayrollsApi#updateTaxLiabilities");
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
| **externalPayrollsUpdateTaxLiabilitiesRequest** | [**ExternalPayrollsUpdateTaxLiabilitiesRequest**](ExternalPayrollsUpdateTaxLiabilitiesRequest.md)|  | [optional] |

### Return type

[**List&lt;TaxLiabilitiesSelections&gt;**](TaxLiabilitiesSelections.md)

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

