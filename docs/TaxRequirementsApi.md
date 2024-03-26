# TaxRequirementsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getStateRequirements**](TaxRequirementsApi.md#getStateRequirements) | **GET** /v1/companies/{company_uuid}/tax_requirements/{state} | Get State Tax Requirements |
| [**getStates**](TaxRequirementsApi.md#getStates) | **GET** /v1/companies/{company_uuid}/tax_requirements | Get All Tax Requirement States |
| [**updateStateTaxes**](TaxRequirementsApi.md#updateStateTaxes) | **PUT** /v1/companies/{company_uuid}/tax_requirements/{state} | Update State Tax Requirements |


<a name="getStateRequirements"></a>
# **getStateRequirements**
> TaxRequirementsState getStateRequirements(companyUuid, state).scheduling(scheduling).xGustoAPIVersion(xGustoAPIVersion).execute();

Get State Tax Requirements

Get all tax requirements for a given state.  ### Metadata Examples  &#x60;&#x60;&#x60;json select {   \&quot;type\&quot;: \&quot;select\&quot;,   \&quot;options\&quot;: [     { \&quot;label\&quot;: \&quot;Semiweekly\&quot;,  value: \&quot;Semi-weekly\&quot; },     { \&quot;label\&quot;: \&quot;Monthly\&quot;,  value: \&quot;Monthly\&quot; },     { \&quot;label\&quot;: \&quot;Quarterly\&quot;,  value: \&quot;Quarterly\&quot; },   ] } &#x60;&#x60;&#x60; &#x60;&#x60;&#x60;json radio {   \&quot;type\&quot;: \&quot;radio\&quot;,   \&quot;options\&quot;: [     { \&quot;label\&quot;: \&quot;No, we cannot reimburse\&quot;,  value: false, short_label: \&quot;Not Reimbursable\&quot; },     { \&quot;label\&quot;: \&quot;Yes, we can reimburse\&quot;,  value: true, short_label: \&quot;Reimbursable\&quot; },   ] } &#x60;&#x60;&#x60; &#x60;&#x60;&#x60;json account_number {   \&quot;type\&quot;: \&quot;account_number\&quot;,   \&quot;mask\&quot;: \&quot;######-##&#39;,   \&quot;prefix\&quot;: null } &#x60;&#x60;&#x60; &#x60;&#x60;&#x60;json tax_rate {   \&quot;type\&quot;: \&quot;tax_rate\&quot;,   \&quot;validation\&quot;: {     \&quot;type\&quot;: \&quot;min_max\&quot;,     \&quot;min\&quot;: \&quot;0.0004\&quot;,     \&quot;max\&quot;: \&quot;0.081\&quot;   } } &#x60;&#x60;&#x60;  scope: &#x60;company_tax_requirements:read&#x60; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaxRequirementsApi;
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
    String state = "state_example"; // 2-letter US state abbreviation
    Boolean scheduling = true; // When true, return \"new\" requirement sets with valid `effective_from` dates that are available to save new effective dated values.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      TaxRequirementsState result = client
              .taxRequirements
              .getStateRequirements(companyUuid, state)
              .scheduling(scheduling)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getState());
      System.out.println(result.getRequirementSets());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxRequirementsApi#getStateRequirements");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaxRequirementsState> response = client
              .taxRequirements
              .getStateRequirements(companyUuid, state)
              .scheduling(scheduling)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxRequirementsApi#getStateRequirements");
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
| **state** | **String**| 2-letter US state abbreviation | |
| **scheduling** | **Boolean**| When true, return \&quot;new\&quot; requirement sets with valid &#x60;effective_from&#x60; dates that are available to save new effective dated values. | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**TaxRequirementsState**](TaxRequirementsState.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getStates"></a>
# **getStates**
> List&lt;TaxRequirementsGetStatesResponseInner&gt; getStates(companyUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get All Tax Requirement States

Returns objects describing the states that have tax requirements for the company  scope: &#x60;company_tax_requirements:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaxRequirementsApi;
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
      List<TaxRequirementsGetStatesResponseInner> result = client
              .taxRequirements
              .getStates(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxRequirementsApi#getStates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TaxRequirementsGetStatesResponseInner>> response = client
              .taxRequirements
              .getStates(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxRequirementsApi#getStates");
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

[**List&lt;TaxRequirementsGetStatesResponseInner&gt;**](TaxRequirementsGetStatesResponseInner.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="updateStateTaxes"></a>
# **updateStateTaxes**
> updateStateTaxes(companyUuid, state).xGustoAPIVersion(xGustoAPIVersion).taxRequirementsUpdateStateTaxesRequest(taxRequirementsUpdateStateTaxesRequest).execute();

Update State Tax Requirements

Update State Tax Requirements  scope: &#x60;company_tax_requirements:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaxRequirementsApi;
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
    String state = "state_example"; // 2-letter US state abbreviation
    List<TaxRequirementsUpdateStateTaxesRequestRequirementSetsInner> requirementSets = Arrays.asList();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .taxRequirements
              .updateStateTaxes(companyUuid, state)
              .requirementSets(requirementSets)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxRequirementsApi#updateStateTaxes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .taxRequirements
              .updateStateTaxes(companyUuid, state)
              .requirementSets(requirementSets)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxRequirementsApi#updateStateTaxes");
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
| **state** | **String**| 2-letter US state abbreviation | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **taxRequirementsUpdateStateTaxesRequest** | [**TaxRequirementsUpdateStateTaxesRequest**](TaxRequirementsUpdateStateTaxesRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

