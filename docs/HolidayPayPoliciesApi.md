# HolidayPayPoliciesApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEmployeesToPolicy**](HolidayPayPoliciesApi.md#addEmployeesToPolicy) | **PUT** /v1/companies/{company_uuid}/holiday_pay_policy/add | Add employees to a company&#39;s holiday pay policy |
| [**createCompanyPolicy**](HolidayPayPoliciesApi.md#createCompanyPolicy) | **POST** /v1/companies/{company_uuid}/holiday_pay_policy | Create a holiday pay policy for a company |
| [**deletePolicy**](HolidayPayPoliciesApi.md#deletePolicy) | **DELETE** /v1/companies/{company_uuid}/holiday_pay_policy | Delete a company&#39;s holiday pay policy |
| [**getCompanyPolicy**](HolidayPayPoliciesApi.md#getCompanyPolicy) | **GET** /v1/companies/{company_uuid}/holiday_pay_policy | Get a company&#39;s holiday pay policy |
| [**previewCompanyPaidHolidays**](HolidayPayPoliciesApi.md#previewCompanyPaidHolidays) | **GET** /v1/companies/{company_uuid}/paid_holidays | Preview a company&#39;s paid holidays |
| [**removeEmployees**](HolidayPayPoliciesApi.md#removeEmployees) | **PUT** /v1/companies/{company_uuid}/holiday_pay_policy/remove | Remove employees from a company&#39;s holiday pay policy |
| [**updatePolicy**](HolidayPayPoliciesApi.md#updatePolicy) | **PUT** /v1/companies/{company_uuid}/holiday_pay_policy | Update a company&#39;s holiday pay policy |


<a name="addEmployeesToPolicy"></a>
# **addEmployeesToPolicy**
> HolidayPayPolicy addEmployeesToPolicy(companyUuid).xGustoAPIVersion(xGustoAPIVersion).holidayPayPoliciesAddEmployeesToPolicyRequest(holidayPayPoliciesAddEmployeesToPolicyRequest).execute();

Add employees to a company&#39;s holiday pay policy

Add employees to a company&#39;s holiday pay policy  scope: &#x60;holiday_pay_policies:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HolidayPayPoliciesApi;
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
    String version = "version_example"; // The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
    String companyUuid = "companyUuid_example"; // The UUID of the company
    List<TimeOffPolicyEmployeesInner> employees = Arrays.asList(); // An array of employee objects, each containing an employee_uuid.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      HolidayPayPolicy result = client
              .holidayPayPolicies
              .addEmployeesToPolicy(version, companyUuid)
              .employees(employees)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getFederalHolidays());
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayPayPoliciesApi#addEmployeesToPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HolidayPayPolicy> response = client
              .holidayPayPolicies
              .addEmployeesToPolicy(version, companyUuid)
              .employees(employees)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayPayPoliciesApi#addEmployeesToPolicy");
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
| **holidayPayPoliciesAddEmployeesToPolicyRequest** | [**HolidayPayPoliciesAddEmployeesToPolicyRequest**](HolidayPayPoliciesAddEmployeesToPolicyRequest.md)|  | [optional] |

### Return type

[**HolidayPayPolicy**](HolidayPayPolicy.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Holiday Pay Policy Object Example |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="createCompanyPolicy"></a>
# **createCompanyPolicy**
> HolidayPayPolicy createCompanyPolicy(companyUuid).xGustoAPIVersion(xGustoAPIVersion).holidayPayPoliciesCreateCompanyPolicyRequest(holidayPayPoliciesCreateCompanyPolicyRequest).execute();

Create a holiday pay policy for a company

Create a holiday pay policy for a company  scope: &#x60;holiday_pay_policies:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HolidayPayPoliciesApi;
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
    HolidayPayPoliciesCreateCompanyPolicyRequestFederalHolidays federalHolidays = new HolidayPayPoliciesCreateCompanyPolicyRequestFederalHolidays();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      HolidayPayPolicy result = client
              .holidayPayPolicies
              .createCompanyPolicy(companyUuid)
              .federalHolidays(federalHolidays)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getFederalHolidays());
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayPayPoliciesApi#createCompanyPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HolidayPayPolicy> response = client
              .holidayPayPolicies
              .createCompanyPolicy(companyUuid)
              .federalHolidays(federalHolidays)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayPayPoliciesApi#createCompanyPolicy");
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
| **holidayPayPoliciesCreateCompanyPolicyRequest** | [**HolidayPayPoliciesCreateCompanyPolicyRequest**](HolidayPayPoliciesCreateCompanyPolicyRequest.md)|  | [optional] |

### Return type

[**HolidayPayPolicy**](HolidayPayPolicy.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Holiday Pay Policy Object Example |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="deletePolicy"></a>
# **deletePolicy**
> deletePolicy(companyUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Delete a company&#39;s holiday pay policy

Delete a company&#39;s holiday pay policy  scope: &#x60;holiday_pay_policies:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HolidayPayPoliciesApi;
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
              .holidayPayPolicies
              .deletePolicy(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayPayPoliciesApi#deletePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .holidayPayPolicies
              .deletePolicy(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayPayPoliciesApi#deletePolicy");
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
| **204** | No Content |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getCompanyPolicy"></a>
# **getCompanyPolicy**
> HolidayPayPolicy getCompanyPolicy(companyUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a company&#39;s holiday pay policy

Get a company&#39;s holiday pay policy  scope: &#x60;holiday_pay_policies:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HolidayPayPoliciesApi;
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
      HolidayPayPolicy result = client
              .holidayPayPolicies
              .getCompanyPolicy(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getFederalHolidays());
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayPayPoliciesApi#getCompanyPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HolidayPayPolicy> response = client
              .holidayPayPolicies
              .getCompanyPolicy(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayPayPoliciesApi#getCompanyPolicy");
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

[**HolidayPayPolicy**](HolidayPayPolicy.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Holiday Pay Policy Object Example |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="previewCompanyPaidHolidays"></a>
# **previewCompanyPaidHolidays**
> PaidHolidays previewCompanyPaidHolidays(companyUuid).xGustoAPIVersion(xGustoAPIVersion).holidayPayPoliciesPreviewCompanyPaidHolidaysRequest(holidayPayPoliciesPreviewCompanyPaidHolidaysRequest).execute();

Preview a company&#39;s paid holidays

Preview a company&#39;s paid holidays  scope: &#x60;holiday_pay_policies:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HolidayPayPoliciesApi;
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
    String year = "year_example"; // If a year is passed, paid holidays for that year will be returned. Otherwise, paid holidays for the next three years will be returned.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      PaidHolidays result = client
              .holidayPayPolicies
              .previewCompanyPaidHolidays(companyUuid)
              .year(year)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchema());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayPayPoliciesApi#previewCompanyPaidHolidays");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaidHolidays> response = client
              .holidayPayPolicies
              .previewCompanyPaidHolidays(companyUuid)
              .year(year)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayPayPoliciesApi#previewCompanyPaidHolidays");
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
| **holidayPayPoliciesPreviewCompanyPaidHolidaysRequest** | [**HolidayPayPoliciesPreviewCompanyPaidHolidaysRequest**](HolidayPayPoliciesPreviewCompanyPaidHolidaysRequest.md)|  | [optional] |

### Return type

[**PaidHolidays**](PaidHolidays.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paid Holidays Object Example |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="removeEmployees"></a>
# **removeEmployees**
> HolidayPayPolicy removeEmployees(companyUuid).xGustoAPIVersion(xGustoAPIVersion).holidayPayPoliciesRemoveEmployeesRequest(holidayPayPoliciesRemoveEmployeesRequest).execute();

Remove employees from a company&#39;s holiday pay policy

Remove employees from a company&#39;s holiday pay policy  scope: &#x60;holiday_pay_policies:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HolidayPayPoliciesApi;
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
    String version = "version_example"; // The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
    String companyUuid = "companyUuid_example"; // The UUID of the company
    List<TimeOffPolicyEmployeesInner> employees = Arrays.asList(); // An array of employee objects, each containing an employee_uuid.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      HolidayPayPolicy result = client
              .holidayPayPolicies
              .removeEmployees(version, companyUuid)
              .employees(employees)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getFederalHolidays());
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayPayPoliciesApi#removeEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HolidayPayPolicy> response = client
              .holidayPayPolicies
              .removeEmployees(version, companyUuid)
              .employees(employees)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayPayPoliciesApi#removeEmployees");
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
| **holidayPayPoliciesRemoveEmployeesRequest** | [**HolidayPayPoliciesRemoveEmployeesRequest**](HolidayPayPoliciesRemoveEmployeesRequest.md)|  | [optional] |

### Return type

[**HolidayPayPolicy**](HolidayPayPolicy.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Holiday Pay Policy Object Example |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="updatePolicy"></a>
# **updatePolicy**
> HolidayPayPolicy updatePolicy(companyUuid).xGustoAPIVersion(xGustoAPIVersion).holidayPayPoliciesUpdatePolicyRequest(holidayPayPoliciesUpdatePolicyRequest).execute();

Update a company&#39;s holiday pay policy

Update a company&#39;s holiday pay policy  scope: &#x60;holiday_pay_policies:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HolidayPayPoliciesApi;
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
    String version = "version_example"; // The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
    String companyUuid = "companyUuid_example"; // The UUID of the company
    HolidayPayPoliciesCreateCompanyPolicyRequestFederalHolidays federalHolidays = new HolidayPayPoliciesCreateCompanyPolicyRequestFederalHolidays();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      HolidayPayPolicy result = client
              .holidayPayPolicies
              .updatePolicy(version, companyUuid)
              .federalHolidays(federalHolidays)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getFederalHolidays());
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayPayPoliciesApi#updatePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HolidayPayPolicy> response = client
              .holidayPayPolicies
              .updatePolicy(version, companyUuid)
              .federalHolidays(federalHolidays)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HolidayPayPoliciesApi#updatePolicy");
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
| **holidayPayPoliciesUpdatePolicyRequest** | [**HolidayPayPoliciesUpdatePolicyRequest**](HolidayPayPoliciesUpdatePolicyRequest.md)|  | [optional] |

### Return type

[**HolidayPayPolicy**](HolidayPayPolicy.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Holiday Pay Policy Object Example |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

