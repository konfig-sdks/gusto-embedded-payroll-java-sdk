# EmployeeTaxSetupApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFederalTaxesById**](EmployeeTaxSetupApi.md#getFederalTaxesById) | **GET** /v1/employees/{employee_uuid}/federal_taxes | Get an employee&#39;s federal taxes |
| [**getStateTaxes**](EmployeeTaxSetupApi.md#getStateTaxes) | **GET** /v1/employees/{employee_uuid}/state_taxes | Get an employee&#39;s state taxes |
| [**updateFederalTaxes**](EmployeeTaxSetupApi.md#updateFederalTaxes) | **PUT** /v1/employees/{employee_uuid}/federal_taxes | Update an employee&#39;s federal taxes |
| [**updateStateTaxes**](EmployeeTaxSetupApi.md#updateStateTaxes) | **PUT** /v1/employees/{employee_uuid}/state_taxes | Update an employee&#39;s state taxes |


<a name="getFederalTaxesById"></a>
# **getFederalTaxesById**
> EmployeeFederalTax getFederalTaxesById(employeeUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get an employee&#39;s federal taxes

Get attributes relevant for an employee&#39;s federal taxes.   scope: &#x60;employee_federal_taxes:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeTaxSetupApi;
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
    String employeeUuid = "employeeUuid_example"; // The UUID of the employee
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      EmployeeFederalTax result = client
              .employeeTaxSetup
              .getFederalTaxesById(employeeUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getFilingStatus());
      System.out.println(result.getExtraWithholding());
      System.out.println(result.getTwoJobs());
      System.out.println(result.getDependentsAmount());
      System.out.println(result.getOtherIncome());
      System.out.println(result.getDeductions());
      System.out.println(result.getW4DataType());
      System.out.println(result.getFederalWithholdingAllowance());
      System.out.println(result.getAdditionalWithholding());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTaxSetupApi#getFederalTaxesById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeFederalTax> response = client
              .employeeTaxSetup
              .getFederalTaxesById(employeeUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTaxSetupApi#getFederalTaxesById");
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
| **employeeUuid** | **String**| The UUID of the employee | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**EmployeeFederalTax**](EmployeeFederalTax.md)

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

<a name="getStateTaxes"></a>
# **getStateTaxes**
> List&lt;EmployeeStateTax&gt; getStateTaxes(employeeUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get an employee&#39;s state taxes

Get attributes relevant for an employee&#39;s state taxes.  The data required to correctly calculate an employee&#39;s state taxes varies by both home and work location. This API returns information about each question that must be answered grouped by state. Mostly commonly, an employee lives and works in the same state and will only have questions for a single state. The response contains metadata about each question, the type of answer expected, and the current answer stored in Gusto for that question.  Answers are represented by an array. Today, this array can only be empty or contain exactly one element, but is designed to allow for forward compatibility with effective-dated fields. Until effective dated answers are supported, the &#x60;valid_from&#x60; and &#x60;valid_up_to&#x60; must always be &#x60;\&quot;2010-01-01\&quot;&#x60; and &#x60;null&#x60; respectively.  ## About filing new hire reports Payroll Admins are responsible for filing a new hire report for each Employee. The &#x60;file_new_hire_report&#x60; question will only be listed if: - the &#x60;employee.onboarding_status&#x60; is one of the following:   - &#x60;admin_onboarding_incomplete&#x60;   - &#x60;self_onboarding_awaiting_admin_review&#x60; - that employee&#39;s work state requires filing a new hire report  scope: &#x60;employee_state_taxes:read&#x60; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeTaxSetupApi;
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
    String employeeUuid = "employeeUuid_example"; // The UUID of the employee
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<EmployeeStateTax> result = client
              .employeeTaxSetup
              .getStateTaxes(employeeUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTaxSetupApi#getStateTaxes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeStateTax>> response = client
              .employeeTaxSetup
              .getStateTaxes(employeeUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTaxSetupApi#getStateTaxes");
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
| **employeeUuid** | **String**| The UUID of the employee | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**List&lt;EmployeeStateTax&gt;**](EmployeeStateTax.md)

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

<a name="updateFederalTaxes"></a>
# **updateFederalTaxes**
> EmployeeFederalTax updateFederalTaxes(employeeUuid).xGustoAPIVersion(xGustoAPIVersion).employeeTaxSetupUpdateFederalTaxesRequest(employeeTaxSetupUpdateFederalTaxesRequest).execute();

Update an employee&#39;s federal taxes

Update attributes relevant for an employee&#39;s federal taxes.  scope: &#x60;employee_federal_taxes:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeTaxSetupApi;
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
    String employeeUuid = "employeeUuid_example"; // The UUID of the employee
    String filingStatus = "filingStatus_example";
    String extraWithholding = "extraWithholding_example";
    Boolean twoJobs = true;
    String dependentsAmount = "dependentsAmount_example";
    String otherIncome = "otherIncome_example";
    String deductions = "deductions_example";
    String w4DataType = "w4DataType_example";
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      EmployeeFederalTax result = client
              .employeeTaxSetup
              .updateFederalTaxes(version, employeeUuid)
              .filingStatus(filingStatus)
              .extraWithholding(extraWithholding)
              .twoJobs(twoJobs)
              .dependentsAmount(dependentsAmount)
              .otherIncome(otherIncome)
              .deductions(deductions)
              .w4DataType(w4DataType)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getFilingStatus());
      System.out.println(result.getExtraWithholding());
      System.out.println(result.getTwoJobs());
      System.out.println(result.getDependentsAmount());
      System.out.println(result.getOtherIncome());
      System.out.println(result.getDeductions());
      System.out.println(result.getW4DataType());
      System.out.println(result.getFederalWithholdingAllowance());
      System.out.println(result.getAdditionalWithholding());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTaxSetupApi#updateFederalTaxes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeFederalTax> response = client
              .employeeTaxSetup
              .updateFederalTaxes(version, employeeUuid)
              .filingStatus(filingStatus)
              .extraWithholding(extraWithholding)
              .twoJobs(twoJobs)
              .dependentsAmount(dependentsAmount)
              .otherIncome(otherIncome)
              .deductions(deductions)
              .w4DataType(w4DataType)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTaxSetupApi#updateFederalTaxes");
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
| **employeeUuid** | **String**| The UUID of the employee | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **employeeTaxSetupUpdateFederalTaxesRequest** | [**EmployeeTaxSetupUpdateFederalTaxesRequest**](EmployeeTaxSetupUpdateFederalTaxesRequest.md)|  | [optional] |

### Return type

[**EmployeeFederalTax**](EmployeeFederalTax.md)

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

<a name="updateStateTaxes"></a>
# **updateStateTaxes**
> List&lt;EmployeeStateTax&gt; updateStateTaxes(employeeUuid).xGustoAPIVersion(xGustoAPIVersion).employeeTaxSetupUpdateStateTaxesRequest(employeeTaxSetupUpdateStateTaxesRequest).execute();

Update an employee&#39;s state taxes

Update attributes relevant for an employee&#39;s state taxes.  As described for the GET endpoint, the answers must be supplied in the effective-dated format, but currently only a single answer will be accepted - &#x60;valid_from&#x60; and &#x60;valid_up_to&#x60; must be &#x60;\&quot;2010-01-01\&quot;&#x60; and &#x60;null&#x60; respectively.  scope: &#x60;employee_state_taxes:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeTaxSetupApi;
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
    Set<EmployeeTaxSetupUpdateStateTaxesRequestStatesInner> states = Arrays.asList();
    String employeeUuid = "employeeUuid_example"; // The UUID of the employee
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<EmployeeStateTax> result = client
              .employeeTaxSetup
              .updateStateTaxes(states, employeeUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTaxSetupApi#updateStateTaxes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeStateTax>> response = client
              .employeeTaxSetup
              .updateStateTaxes(states, employeeUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeTaxSetupApi#updateStateTaxes");
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
| **employeeUuid** | **String**| The UUID of the employee | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **employeeTaxSetupUpdateStateTaxesRequest** | [**EmployeeTaxSetupUpdateStateTaxesRequest**](EmployeeTaxSetupUpdateStateTaxesRequest.md)|  | [optional] |

### Return type

[**List&lt;EmployeeStateTax&gt;**](EmployeeStateTax.md)

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

