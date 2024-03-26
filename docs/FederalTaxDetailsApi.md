# FederalTaxDetailsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAttributes**](FederalTaxDetailsApi.md#getAttributes) | **GET** /v1/companies/{company_id}/federal_tax_details | Get Federal Tax Details |
| [**updateAttributes**](FederalTaxDetailsApi.md#updateAttributes) | **PUT** /v1/companies/{company_id}/federal_tax_details | Update Federal Tax Details |


<a name="getAttributes"></a>
# **getAttributes**
> FederalTaxDetails getAttributes(companyId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get Federal Tax Details

Fetches attributes relevant for a company&#39;s federal taxes.  scope: &#x60;company_federal_taxes:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FederalTaxDetailsApi;
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
      FederalTaxDetails result = client
              .federalTaxDetails
              .getAttributes(companyId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getTaxPayerType());
      System.out.println(result.getTaxableAsScorp());
      System.out.println(result.getFilingForm());
      System.out.println(result.getHasEin());
      System.out.println(result.getEinVerified());
      System.out.println(result.getLegalName());
    } catch (ApiException e) {
      System.err.println("Exception when calling FederalTaxDetailsApi#getAttributes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FederalTaxDetails> response = client
              .federalTaxDetails
              .getAttributes(companyId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FederalTaxDetailsApi#getAttributes");
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

[**FederalTaxDetails**](FederalTaxDetails.md)

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

<a name="updateAttributes"></a>
# **updateAttributes**
> FederalTaxDetails updateAttributes(companyId).xGustoAPIVersion(xGustoAPIVersion).federalTaxDetailsUpdateAttributesRequest(federalTaxDetailsUpdateAttributesRequest).execute();

Update Federal Tax Details

Updates attributes relevant for a company&#39;s federal taxes. This information is required is to onboard a company for use with Gusto Embedded Payroll.  scope: &#x60;company_federal_taxes:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FederalTaxDetailsApi;
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
    String companyId = "companyId_example"; // The UUID of the company
    String legalName = "legalName_example"; // The legal name of the company
    String ein = "ein_example"; // The EIN of of the company
    String taxPayerType = "C-Corporation"; // What type of tax entity the company is
    String filingForm = "filingForm_example"; // The form used by the company for federal tax filing. One of: - 941 (Quarterly federal tax return) - 944 (Annual federal tax return)
    Boolean taxableAsScorp = true; // Whether this company should be taxed as an S-Corporation
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      FederalTaxDetails result = client
              .federalTaxDetails
              .updateAttributes(version, companyId)
              .legalName(legalName)
              .ein(ein)
              .taxPayerType(taxPayerType)
              .filingForm(filingForm)
              .taxableAsScorp(taxableAsScorp)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getTaxPayerType());
      System.out.println(result.getTaxableAsScorp());
      System.out.println(result.getFilingForm());
      System.out.println(result.getHasEin());
      System.out.println(result.getEinVerified());
      System.out.println(result.getLegalName());
    } catch (ApiException e) {
      System.err.println("Exception when calling FederalTaxDetailsApi#updateAttributes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FederalTaxDetails> response = client
              .federalTaxDetails
              .updateAttributes(version, companyId)
              .legalName(legalName)
              .ein(ein)
              .taxPayerType(taxPayerType)
              .filingForm(filingForm)
              .taxableAsScorp(taxableAsScorp)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FederalTaxDetailsApi#updateAttributes");
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
| **federalTaxDetailsUpdateAttributesRequest** | [**FederalTaxDetailsUpdateAttributesRequest**](FederalTaxDetailsUpdateAttributesRequest.md)| Attributes related to federal tax details that can be updated via this endpoint include: | [optional] |

### Return type

[**FederalTaxDetails**](FederalTaxDetails.md)

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

