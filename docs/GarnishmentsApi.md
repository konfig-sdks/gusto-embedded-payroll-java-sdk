# GarnishmentsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createGarnishment**](GarnishmentsApi.md#createGarnishment) | **POST** /v1/employees/{employee_id}/garnishments | Create a garnishment |
| [**getEmployeeGarnishments**](GarnishmentsApi.md#getEmployeeGarnishments) | **GET** /v1/employees/{employee_id}/garnishments | Get garnishments for an employee |
| [**getGarnishment**](GarnishmentsApi.md#getGarnishment) | **GET** /v1/garnishments/{garnishment_id} | Get a garnishment |
| [**updateGarnishment**](GarnishmentsApi.md#updateGarnishment) | **PUT** /v1/garnishments/{garnishment_id} | Update a garnishment |


<a name="createGarnishment"></a>
# **createGarnishment**
> Garnishment createGarnishment(employeeId).xGustoAPIVersion(xGustoAPIVersion).garnishmentsCreateGarnishmentRequest(garnishmentsCreateGarnishmentRequest).execute();

Create a garnishment

Garnishments, or employee deductions, are fixed amounts or percentages deducted from an employee’s pay. They can be deducted a specific number of times or on a recurring basis. Garnishments can also have maximum deductions on a yearly or per-pay-period bases. Common uses for garnishments are court-ordered payments for child support or back taxes. Some companies provide loans to their employees that are repaid via garnishments.  scope: &#x60;garnishments:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GarnishmentsApi;
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
    String description = "description_example"; // The description of the garnishment.
    Float amount = 3.4F; // The amount of the garnishment. Either a percentage or a fixed dollar amount. Represented as a float, e.g. \\\"8.00\\\".
    Boolean courtOrdered = true; // Whether the garnishment is court ordered.
    String employeeId = "employeeId_example"; // The UUID of the employee
    Boolean active = true; // Whether or not this garnishment is currently active.
    Integer times = 56; // The number of times to apply the garnishment. Ignored if recurring is true.
    Boolean recurring = false; // Whether the garnishment should recur indefinitely.
    Float annualMaximum = 3.4F; // The maximum deduction per annum. A null value indicates no maximum. Represented as a float, e.g. \\\"200.00\\\".
    Float payPeriodMaximum = 3.4F; // The maximum deduction per pay period. A null value indicates no maximum. Represented as a float, e.g. \\\"16.00\\\".
    Boolean deductAsPercentage = false; // Whether the amount should be treated as a percentage to be deducted per pay period.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Garnishment result = client
              .garnishments
              .createGarnishment(description, amount, courtOrdered, employeeId)
              .active(active)
              .times(times)
              .recurring(recurring)
              .annualMaximum(annualMaximum)
              .payPeriodMaximum(payPeriodMaximum)
              .deductAsPercentage(deductAsPercentage)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getEmployeeUuid());
      System.out.println(result.getActive());
      System.out.println(result.getAmount());
      System.out.println(result.getCourtOrdered());
      System.out.println(result.getTimes());
      System.out.println(result.getRecurring());
      System.out.println(result.getAnnualMaximum());
      System.out.println(result.getPayPeriodMaximum());
      System.out.println(result.getDeductAsPercentage());
    } catch (ApiException e) {
      System.err.println("Exception when calling GarnishmentsApi#createGarnishment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Garnishment> response = client
              .garnishments
              .createGarnishment(description, amount, courtOrdered, employeeId)
              .active(active)
              .times(times)
              .recurring(recurring)
              .annualMaximum(annualMaximum)
              .payPeriodMaximum(payPeriodMaximum)
              .deductAsPercentage(deductAsPercentage)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GarnishmentsApi#createGarnishment");
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
| **garnishmentsCreateGarnishmentRequest** | [**GarnishmentsCreateGarnishmentRequest**](GarnishmentsCreateGarnishmentRequest.md)|  | [optional] |

### Return type

[**Garnishment**](Garnishment.md)

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

<a name="getEmployeeGarnishments"></a>
# **getEmployeeGarnishments**
> List&lt;Garnishment&gt; getEmployeeGarnishments(employeeId).page(page).per(per).xGustoAPIVersion(xGustoAPIVersion).execute();

Get garnishments for an employee

Garnishments, or employee deductions, are fixed amounts or percentages deducted from an employee’s pay. They can be deducted a specific number of times or on a recurring basis. Garnishments can also have maximum deductions on a yearly or per-pay-period bases. Common uses for garnishments are court-ordered payments for child support or back taxes. Some companies provide loans to their employees that are repaid via garnishments.  scope: &#x60;garnishments:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GarnishmentsApi;
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
      List<Garnishment> result = client
              .garnishments
              .getEmployeeGarnishments(employeeId)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GarnishmentsApi#getEmployeeGarnishments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Garnishment>> response = client
              .garnishments
              .getEmployeeGarnishments(employeeId)
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
      System.err.println("Exception when calling GarnishmentsApi#getEmployeeGarnishments");
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

### Return type

[**List&lt;Garnishment&gt;**](Garnishment.md)

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

<a name="getGarnishment"></a>
# **getGarnishment**
> Garnishment getGarnishment(garnishmentId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a garnishment

Garnishments, or employee deductions, are fixed amounts or percentages deducted from an employee’s pay. They can be deducted a specific number of times or on a recurring basis. Garnishments can also have maximum deductions on a yearly or per-pay-period bases. Common uses for garnishments are court-ordered payments for child support or back taxes. Some companies provide loans to their employees that are repaid via garnishments.  scope: &#x60;garnishments:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GarnishmentsApi;
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
    String garnishmentId = "garnishmentId_example"; // The UUID of the garnishment
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Garnishment result = client
              .garnishments
              .getGarnishment(garnishmentId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getEmployeeUuid());
      System.out.println(result.getActive());
      System.out.println(result.getAmount());
      System.out.println(result.getCourtOrdered());
      System.out.println(result.getTimes());
      System.out.println(result.getRecurring());
      System.out.println(result.getAnnualMaximum());
      System.out.println(result.getPayPeriodMaximum());
      System.out.println(result.getDeductAsPercentage());
    } catch (ApiException e) {
      System.err.println("Exception when calling GarnishmentsApi#getGarnishment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Garnishment> response = client
              .garnishments
              .getGarnishment(garnishmentId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GarnishmentsApi#getGarnishment");
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
| **garnishmentId** | **String**| The UUID of the garnishment | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**Garnishment**](Garnishment.md)

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

<a name="updateGarnishment"></a>
# **updateGarnishment**
> Garnishment updateGarnishment(garnishmentId).xGustoAPIVersion(xGustoAPIVersion).garnishmentsUpdateGarnishmentRequest(garnishmentsUpdateGarnishmentRequest).execute();

Update a garnishment

Garnishments, or employee deductions, are fixed amounts or percentages deducted from an employee’s pay. They can be deducted a specific number of times or on a recurring basis. Garnishments can also have maximum deductions on a yearly or per-pay-period bases. Common uses for garnishments are court-ordered payments for child support or back taxes. Some companies provide loans to their employees that are repaid via garnishments.  scope: &#x60;garnishments:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GarnishmentsApi;
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
    String garnishmentId = "garnishmentId_example"; // The UUID of the garnishment
    String description = "description_example"; // The description of the garnishment.
    Boolean active = true; // Whether or not this garnishment is currently active.
    Float amount = 3.4F; // The amount of the garnishment. Either a percentage or a fixed dollar amount. Represented as a float, e.g. \\\"8.00\\\".
    Boolean courtOrdered = true; // Whether the garnishment is court ordered.
    Integer times = 56; // The number of times to apply the garnishment. Ignored if recurring is true.
    Boolean recurring = false; // Whether the garnishment should recur indefinitely.
    Float annualMaximum = 3.4F; // The maximum deduction per annum. A null value indicates no maximum. Represented as a float, e.g. \\\"200.00\\\".
    Float payPeriodMaximum = 3.4F; // The maximum deduction per pay period. A null value indicates no maximum. Represented as a float, e.g. \\\"16.00\\\".
    Boolean deductAsPercentage = false; // Whether the amount should be treated as a percentage to be deducted per pay period.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Garnishment result = client
              .garnishments
              .updateGarnishment(version, garnishmentId)
              .description(description)
              .active(active)
              .amount(amount)
              .courtOrdered(courtOrdered)
              .times(times)
              .recurring(recurring)
              .annualMaximum(annualMaximum)
              .payPeriodMaximum(payPeriodMaximum)
              .deductAsPercentage(deductAsPercentage)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getEmployeeUuid());
      System.out.println(result.getActive());
      System.out.println(result.getAmount());
      System.out.println(result.getCourtOrdered());
      System.out.println(result.getTimes());
      System.out.println(result.getRecurring());
      System.out.println(result.getAnnualMaximum());
      System.out.println(result.getPayPeriodMaximum());
      System.out.println(result.getDeductAsPercentage());
    } catch (ApiException e) {
      System.err.println("Exception when calling GarnishmentsApi#updateGarnishment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Garnishment> response = client
              .garnishments
              .updateGarnishment(version, garnishmentId)
              .description(description)
              .active(active)
              .amount(amount)
              .courtOrdered(courtOrdered)
              .times(times)
              .recurring(recurring)
              .annualMaximum(annualMaximum)
              .payPeriodMaximum(payPeriodMaximum)
              .deductAsPercentage(deductAsPercentage)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GarnishmentsApi#updateGarnishment");
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
| **garnishmentId** | **String**| The UUID of the garnishment | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **garnishmentsUpdateGarnishmentRequest** | [**GarnishmentsUpdateGarnishmentRequest**](GarnishmentsUpdateGarnishmentRequest.md)|  | [optional] |

### Return type

[**Garnishment**](Garnishment.md)

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

