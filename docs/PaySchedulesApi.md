# PaySchedulesApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignEmployeesToSchedules**](PaySchedulesApi.md#assignEmployeesToSchedules) | **POST** /v1/companies/{company_id}/pay_schedules/assign | Assign pay schedules for a company |
| [**createNew**](PaySchedulesApi.md#createNew) | **POST** /v1/companies/{company_id}/pay_schedules | Create a new pay schedule |
| [**getAssignments**](PaySchedulesApi.md#getAssignments) | **GET** /v1/companies/{company_id}/pay_schedules/assignments | Get pay schedule assignments for a company |
| [**getDetails**](PaySchedulesApi.md#getDetails) | **GET** /v1/companies/{company_id}/pay_schedules/{pay_schedule_id} | Get a pay schedule |
| [**getPayPeriods**](PaySchedulesApi.md#getPayPeriods) | **GET** /v1/companies/{company_id}/pay_periods | Get pay periods for a company |
| [**getUnprocessedTerminationPayPeriods**](PaySchedulesApi.md#getUnprocessedTerminationPayPeriods) | **GET** /v1/companies/{company_id}/pay_periods/unprocessed_termination_pay_periods | Get termination pay periods for a company |
| [**listForCompany**](PaySchedulesApi.md#listForCompany) | **GET** /v1/companies/{company_id}/pay_schedules | Get the pay schedules for a company |
| [**previewAssignmentsForCompany**](PaySchedulesApi.md#previewAssignmentsForCompany) | **POST** /v1/companies/{company_id}/pay_schedules/assignment_preview | Preview pay schedule assignments for a company |
| [**previewPayScheduleDates**](PaySchedulesApi.md#previewPayScheduleDates) | **GET** /v1/companies/{company_id}/pay_schedules/preview | Preview pay schedule dates |
| [**updatePaySchedule**](PaySchedulesApi.md#updatePaySchedule) | **PUT** /v1/companies/{company_id}/pay_schedules/{pay_schedule_id} | Update a pay schedule |


<a name="assignEmployeesToSchedules"></a>
# **assignEmployeesToSchedules**
> assignEmployeesToSchedules(companyId).xGustoAPIVersion(xGustoAPIVersion).payScheduleAssignmentBody(payScheduleAssignmentBody).execute();

Assign pay schedules for a company

This endpoints assigns employees to specified pay schedules based on the pay schedule type.  scope: &#x60;pay_schedules:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaySchedulesApi;
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
    String type = "single"; // The pay schedule assignment type.
    String companyId = "companyId_example"; // The UUID of the company
    String hourlyPayScheduleUuid = "hourlyPayScheduleUuid_example"; // Pay schedule for hourly employees.
    String salariedPayScheduleUuid = "salariedPayScheduleUuid_example"; // Pay schedule for salaried employees.
    String defaultPayScheduleUuid = "defaultPayScheduleUuid_example"; // Default pay schedule for employees.
    List<PayScheduleAssignmentBodyEmployeesInner> employees = Arrays.asList(); // List of employees and their pay schedules.
    List<PayScheduleAssignmentBodyDepartmentsInner> departments = Arrays.asList(); // List of departments and their pay schedules.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .paySchedules
              .assignEmployeesToSchedules(type, companyId)
              .hourlyPayScheduleUuid(hourlyPayScheduleUuid)
              .salariedPayScheduleUuid(salariedPayScheduleUuid)
              .defaultPayScheduleUuid(defaultPayScheduleUuid)
              .employees(employees)
              .departments(departments)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#assignEmployeesToSchedules");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .paySchedules
              .assignEmployeesToSchedules(type, companyId)
              .hourlyPayScheduleUuid(hourlyPayScheduleUuid)
              .salariedPayScheduleUuid(salariedPayScheduleUuid)
              .defaultPayScheduleUuid(defaultPayScheduleUuid)
              .employees(employees)
              .departments(departments)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#assignEmployeesToSchedules");
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
| **payScheduleAssignmentBody** | [**PayScheduleAssignmentBody**](PayScheduleAssignmentBody.md)|  | [optional] |

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
| **200** | No Content |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="createNew"></a>
# **createNew**
> PaySchedule createNew(companyId).xGustoAPIVersion(xGustoAPIVersion).paySchedulesCreateNewRequest(paySchedulesCreateNewRequest).execute();

Create a new pay schedule

If a company does not have any pay schedules, this endpoint will create a single pay schedule and assign it to all employees. This is a common use case during company onboarding.  If a company has an existing active pay schedule and want to support multiple pay schedules, this endpoint will create a pay schedule that is not assigned to any employee.  Be sure to **[check state laws](https://www.dol.gov/agencies/whd/state/payday)** to know what schedule is right for your customers.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaySchedulesApi;
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
    String frequency = "Every week"; // The frequency that employees on this pay schedule are paid with Gusto.
    String anchorPayDate = "anchorPayDate_example"; // The first date that employees on this pay schedule are paid with Gusto.
    String anchorEndOfPayPeriod = "anchorEndOfPayPeriod_example"; // The last date of the first pay period. This can be the same date as the anchor pay date.
    String companyId = "companyId_example"; // The UUID of the company
    Integer day1 = 56; // An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
    Integer day2 = 56; // An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the \\\"Twice per month\\\" frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
    String customName = "customName_example"; // A custom pay schedule name, defaults to the pay frequency description.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      PaySchedule result = client
              .paySchedules
              .createNew(frequency, anchorPayDate, anchorEndOfPayPeriod, companyId)
              .day1(day1)
              .day2(day2)
              .customName(customName)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getFrequency());
      System.out.println(result.getAnchorPayDate());
      System.out.println(result.getAnchorEndOfPayPeriod());
      System.out.println(result.getDay1());
      System.out.println(result.getDay2());
      System.out.println(result.getName());
      System.out.println(result.getCustomName());
      System.out.println(result.getAutoPilot());
      System.out.println(result.getActive());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#createNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaySchedule> response = client
              .paySchedules
              .createNew(frequency, anchorPayDate, anchorEndOfPayPeriod, companyId)
              .day1(day1)
              .day2(day2)
              .customName(customName)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#createNew");
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
| **paySchedulesCreateNewRequest** | [**PaySchedulesCreateNewRequest**](PaySchedulesCreateNewRequest.md)|  | [optional] |

### Return type

[**PaySchedule**](PaySchedule.md)

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

<a name="getAssignments"></a>
# **getAssignments**
> PayScheduleAssignment getAssignments(companyId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get pay schedule assignments for a company

This endpoint returns the current pay schedule assignment for a company, with pay schedule and employee/department mappings depending on the pay schedule type.  scope: &#x60;pay_schedules:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaySchedulesApi;
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
      PayScheduleAssignment result = client
              .paySchedules
              .getAssignments(companyId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getType());
      System.out.println(result.getHourlyPayScheduleUuid());
      System.out.println(result.getSalariedPayScheduleUuid());
      System.out.println(result.getDefaultPayScheduleUuid());
      System.out.println(result.getEmployees());
      System.out.println(result.getDepartments());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#getAssignments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayScheduleAssignment> response = client
              .paySchedules
              .getAssignments(companyId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#getAssignments");
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

[**PayScheduleAssignment**](PayScheduleAssignment.md)

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

<a name="getDetails"></a>
# **getDetails**
> PaySchedule getDetails(companyId, payScheduleId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a pay schedule

The pay schedule object in Gusto captures the details of when employees work and when they should be paid. A company can have multiple pay schedules.  scope: &#x60;pay_schedules:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaySchedulesApi;
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
    String payScheduleId = "payScheduleId_example"; // The UUID of the pay schedule
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      PaySchedule result = client
              .paySchedules
              .getDetails(companyId, payScheduleId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getFrequency());
      System.out.println(result.getAnchorPayDate());
      System.out.println(result.getAnchorEndOfPayPeriod());
      System.out.println(result.getDay1());
      System.out.println(result.getDay2());
      System.out.println(result.getName());
      System.out.println(result.getCustomName());
      System.out.println(result.getAutoPilot());
      System.out.println(result.getActive());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaySchedule> response = client
              .paySchedules
              .getDetails(companyId, payScheduleId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#getDetails");
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
| **payScheduleId** | **String**| The UUID of the pay schedule | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**PaySchedule**](PaySchedule.md)

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

<a name="getPayPeriods"></a>
# **getPayPeriods**
> List&lt;PayPeriod&gt; getPayPeriods(companyId).startDate(startDate).endDate(endDate).payrollTypes(payrollTypes).xGustoAPIVersion(xGustoAPIVersion).execute();

Get pay periods for a company

Pay periods are the foundation of payroll. Compensation, time &amp; attendance, taxes, and expense reports all rely on when they happened. To begin submitting information for a given payroll, we need to agree on the time period.  By default, this endpoint returns pay periods starting from 6 months ago to the date today.  Use the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters to change the scope of the response.  End dates can be up to 3 months in the future and there is no limit on start dates.  Starting in version &#39;2023-04-01&#39;, the eligible_employees attribute was removed from the response.  The eligible employees for a payroll are determined by the employee_compensations returned from the payrolls#prepare endpoint.  scope: &#x60;payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaySchedulesApi;
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
    String startDate = "2020-01-01";
    String endDate = "2020-01-31";
    String payrollTypes = "payrollTypes_example"; // regular and/or transition. Multiple options are comma separated. The default is regular pay periods if nothing is passed in.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<PayPeriod> result = client
              .paySchedules
              .getPayPeriods(companyId)
              .startDate(startDate)
              .endDate(endDate)
              .payrollTypes(payrollTypes)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#getPayPeriods");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PayPeriod>> response = client
              .paySchedules
              .getPayPeriods(companyId)
              .startDate(startDate)
              .endDate(endDate)
              .payrollTypes(payrollTypes)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#getPayPeriods");
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
| **startDate** | **String**|  | [optional] |
| **endDate** | **String**|  | [optional] |
| **payrollTypes** | **String**| regular and/or transition. Multiple options are comma separated. The default is regular pay periods if nothing is passed in. | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**List&lt;PayPeriod&gt;**](PayPeriod.md)

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

<a name="getUnprocessedTerminationPayPeriods"></a>
# **getUnprocessedTerminationPayPeriods**
> List&lt;UnprocessedTerminationPayPeriod&gt; getUnprocessedTerminationPayPeriods(companyId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get termination pay periods for a company

When a payroll admin terminates an employee and selects \&quot;Dismissal Payroll\&quot; as the employee&#39;s final payroll, their last pay period will appear on the list.  This endpoint returns the unprocessed pay periods for past and future terminated employees in a given company.  scope: &#x60;payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaySchedulesApi;
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
      List<UnprocessedTerminationPayPeriod> result = client
              .paySchedules
              .getUnprocessedTerminationPayPeriods(companyId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#getUnprocessedTerminationPayPeriods");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<UnprocessedTerminationPayPeriod>> response = client
              .paySchedules
              .getUnprocessedTerminationPayPeriods(companyId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#getUnprocessedTerminationPayPeriods");
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

[**List&lt;UnprocessedTerminationPayPeriod&gt;**](UnprocessedTerminationPayPeriod.md)

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
> List&lt;PaySchedule&gt; listForCompany(companyId).page(page).per(per).xGustoAPIVersion(xGustoAPIVersion).execute();

Get the pay schedules for a company

The pay schedule object in Gusto captures the details of when employees work and when they should be paid. A company can have multiple pay schedules.  scope: &#x60;pay_schedules:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaySchedulesApi;
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
    Double page = 3.4D; // The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
    Double per = 3.4D; // Number of objects per page. For majority of endpoints will default to 25
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<PaySchedule> result = client
              .paySchedules
              .listForCompany(companyId)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#listForCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PaySchedule>> response = client
              .paySchedules
              .listForCompany(companyId)
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
      System.err.println("Exception when calling PaySchedulesApi#listForCompany");
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
| **page** | **Double**| The page that is requested. When unspecified, will load all objects unless endpoint forces pagination. | [optional] |
| **per** | **Double**| Number of objects per page. For majority of endpoints will default to 25 | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**List&lt;PaySchedule&gt;**](PaySchedule.md)

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

<a name="previewAssignmentsForCompany"></a>
# **previewAssignmentsForCompany**
> PayScheduleAssignmentPreview previewAssignmentsForCompany(companyId).xGustoAPIVersion(xGustoAPIVersion).payScheduleAssignmentBody(payScheduleAssignmentBody).execute();

Preview pay schedule assignments for a company

This endpoints returns the employee changes, including pay period and transition pay periods, for changing the pay schedule.  scope: &#x60;pay_schedules:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaySchedulesApi;
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
    String type = "single"; // The pay schedule assignment type.
    String companyId = "companyId_example"; // The UUID of the company
    String hourlyPayScheduleUuid = "hourlyPayScheduleUuid_example"; // Pay schedule for hourly employees.
    String salariedPayScheduleUuid = "salariedPayScheduleUuid_example"; // Pay schedule for salaried employees.
    String defaultPayScheduleUuid = "defaultPayScheduleUuid_example"; // Default pay schedule for employees.
    List<PayScheduleAssignmentBodyEmployeesInner> employees = Arrays.asList(); // List of employees and their pay schedules.
    List<PayScheduleAssignmentBodyDepartmentsInner> departments = Arrays.asList(); // List of departments and their pay schedules.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      PayScheduleAssignmentPreview result = client
              .paySchedules
              .previewAssignmentsForCompany(type, companyId)
              .hourlyPayScheduleUuid(hourlyPayScheduleUuid)
              .salariedPayScheduleUuid(salariedPayScheduleUuid)
              .defaultPayScheduleUuid(defaultPayScheduleUuid)
              .employees(employees)
              .departments(departments)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getType());
      System.out.println(result.getEmployeeChanges());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#previewAssignmentsForCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayScheduleAssignmentPreview> response = client
              .paySchedules
              .previewAssignmentsForCompany(type, companyId)
              .hourlyPayScheduleUuid(hourlyPayScheduleUuid)
              .salariedPayScheduleUuid(salariedPayScheduleUuid)
              .defaultPayScheduleUuid(defaultPayScheduleUuid)
              .employees(employees)
              .departments(departments)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#previewAssignmentsForCompany");
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
| **payScheduleAssignmentBody** | [**PayScheduleAssignmentBody**](PayScheduleAssignmentBody.md)|  | [optional] |

### Return type

[**PayScheduleAssignmentPreview**](PayScheduleAssignmentPreview.md)

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

<a name="previewPayScheduleDates"></a>
# **previewPayScheduleDates**
> PaySchedulesPreviewPayScheduleDatesResponse previewPayScheduleDates(companyId).frequency(frequency).anchorPayDate(anchorPayDate).anchorEndOfPayPeriod(anchorEndOfPayPeriod).day1(day1).day2(day2).xGustoAPIVersion(xGustoAPIVersion).execute();

Preview pay schedule dates

Provides a preview of a pay schedule with the specified parameters  scope: &#x60;pay_schedules:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaySchedulesApi;
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
    String frequency = "Every week"; // The frequency that employees on this pay schedule are paid with Gusto.
    String anchorPayDate = "2020-05-15"; // The first date that employees on this pay schedule are paid with Gusto.
    String anchorEndOfPayPeriod = "2020-05-08"; // The last date of the first pay period. This can be the same date as the anchor pay date.
    Integer day1 = 56; // An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
    Integer day2 = 56; // An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the \"Twice per month\" frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      PaySchedulesPreviewPayScheduleDatesResponse result = client
              .paySchedules
              .previewPayScheduleDates(companyId)
              .frequency(frequency)
              .anchorPayDate(anchorPayDate)
              .anchorEndOfPayPeriod(anchorEndOfPayPeriod)
              .day1(day1)
              .day2(day2)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayPeriods());
      System.out.println(result.getHolidays());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#previewPayScheduleDates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaySchedulesPreviewPayScheduleDatesResponse> response = client
              .paySchedules
              .previewPayScheduleDates(companyId)
              .frequency(frequency)
              .anchorPayDate(anchorPayDate)
              .anchorEndOfPayPeriod(anchorEndOfPayPeriod)
              .day1(day1)
              .day2(day2)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#previewPayScheduleDates");
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
| **frequency** | **String**| The frequency that employees on this pay schedule are paid with Gusto. | [optional] [enum: Every week, Every other week, Twice per month, Monthly] |
| **anchorPayDate** | **String**| The first date that employees on this pay schedule are paid with Gusto. | [optional] |
| **anchorEndOfPayPeriod** | **String**| The last date of the first pay period. This can be the same date as the anchor pay date. | [optional] |
| **day1** | **Integer**| An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies. | [optional] |
| **day2** | **Integer**| An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the \&quot;Twice per month\&quot; frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies. | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**PaySchedulesPreviewPayScheduleDatesResponse**](PaySchedulesPreviewPayScheduleDatesResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updatePaySchedule"></a>
# **updatePaySchedule**
> PaySchedule updatePaySchedule(companyId, payScheduleId).xGustoAPIVersion(xGustoAPIVersion).paySchedulesUpdatePayScheduleRequest(paySchedulesUpdatePayScheduleRequest).execute();

Update a pay schedule

Updates a pay schedule.  scope: &#x60;pay_schedules:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaySchedulesApi;
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
    String payScheduleId = "payScheduleId_example"; // The UUID of the pay schedule
    String frequency = "Every week"; // The frequency that employees on this pay schedule are paid with Gusto.
    String anchorPayDate = "anchorPayDate_example"; // The first date that employees on this pay schedule are paid with Gusto.
    String anchorEndOfPayPeriod = "anchorEndOfPayPeriod_example"; // The last date of the first pay period. This can be the same date as the anchor pay date.
    Integer day1 = 56; // An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
    Integer day2 = 56; // An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the \\\"Twice per month\\\" frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
    String customName = "customName_example"; // A custom pay schedule name.
    Boolean autoPilot = true; // With Autopilot® enabled, payroll will run automatically one day before your payroll deadlines.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      PaySchedule result = client
              .paySchedules
              .updatePaySchedule(version, companyId, payScheduleId)
              .frequency(frequency)
              .anchorPayDate(anchorPayDate)
              .anchorEndOfPayPeriod(anchorEndOfPayPeriod)
              .day1(day1)
              .day2(day2)
              .customName(customName)
              .autoPilot(autoPilot)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getFrequency());
      System.out.println(result.getAnchorPayDate());
      System.out.println(result.getAnchorEndOfPayPeriod());
      System.out.println(result.getDay1());
      System.out.println(result.getDay2());
      System.out.println(result.getName());
      System.out.println(result.getCustomName());
      System.out.println(result.getAutoPilot());
      System.out.println(result.getActive());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#updatePaySchedule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaySchedule> response = client
              .paySchedules
              .updatePaySchedule(version, companyId, payScheduleId)
              .frequency(frequency)
              .anchorPayDate(anchorPayDate)
              .anchorEndOfPayPeriod(anchorEndOfPayPeriod)
              .day1(day1)
              .day2(day2)
              .customName(customName)
              .autoPilot(autoPilot)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaySchedulesApi#updatePaySchedule");
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
| **payScheduleId** | **String**| The UUID of the pay schedule | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **paySchedulesUpdatePayScheduleRequest** | [**PaySchedulesUpdatePayScheduleRequest**](PaySchedulesUpdatePayScheduleRequest.md)|  | [optional] |

### Return type

[**PaySchedule**](PaySchedule.md)

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

