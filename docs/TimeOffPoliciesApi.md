# TimeOffPoliciesApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEmployeesToPolicy**](TimeOffPoliciesApi.md#addEmployeesToPolicy) | **PUT** /v1/time_off_policies/{time_off_policy_uuid}/add_employees | Add employees to a time off policy |
| [**calculateAccruingTimeOffHours**](TimeOffPoliciesApi.md#calculateAccruingTimeOffHours) | **POST** /v1/payrolls/{payroll_id}/employees/{employee_id}/calculate_accruing_time_off_hours | Calculate accruing time off hours |
| [**createPolicy**](TimeOffPoliciesApi.md#createPolicy) | **POST** /v1/companies/{company_uuid}/time_off_policies | Create a time off policy |
| [**deactivatePolicy**](TimeOffPoliciesApi.md#deactivatePolicy) | **PUT** /v1/time_off_policies/{time_off_policy_uuid}/deactivate | Deactivate a time off policy |
| [**getAllPolicies**](TimeOffPoliciesApi.md#getAllPolicies) | **GET** /v1/companies/{company_uuid}/time_off_policies | Get all time off policies |
| [**getPolicy**](TimeOffPoliciesApi.md#getPolicy) | **GET** /v1/time_off_policies/{time_off_policy_uuid} | Get a time off policy |
| [**removeEmployees**](TimeOffPoliciesApi.md#removeEmployees) | **PUT** /v1/time_off_policies/{time_off_policy_uuid}/remove_employees | Remove employees from a time off policy |
| [**updateEmployeeBalance**](TimeOffPoliciesApi.md#updateEmployeeBalance) | **PUT** /v1/time_off_policies/{time_off_policy_uuid}/balance | Update employee time off hour balances |
| [**updatePolicy**](TimeOffPoliciesApi.md#updatePolicy) | **PUT** /v1/time_off_policies/{time_off_policy_uuid} | Update a time off policy |


<a name="addEmployeesToPolicy"></a>
# **addEmployeesToPolicy**
> TimeOffPolicy addEmployeesToPolicy(timeOffPolicyUuid).xGustoAPIVersion(xGustoAPIVersion).timeOffPoliciesAddEmployeesToPolicyRequest(timeOffPoliciesAddEmployeesToPolicyRequest).execute();

Add employees to a time off policy

Add employees to a time off policy. Employees are required to have at least one job to be added to a time off policy. Accepts starting balances for non-unlimited policies  scope: &#x60;time_off_policies:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffPoliciesApi;
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
    String timeOffPolicyUuid = "timeOffPolicyUuid_example"; // The UUID of the company time off policy
    List<TimeOffPoliciesAddEmployeesToPolicyRequestEmployeesInner> employees = Arrays.asList();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      TimeOffPolicy result = client
              .timeOffPolicies
              .addEmployeesToPolicy(timeOffPolicyUuid)
              .employees(employees)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getName());
      System.out.println(result.getPolicyType());
      System.out.println(result.getAccrualMethod());
      System.out.println(result.getAccrualRate());
      System.out.println(result.getAccrualRateUnit());
      System.out.println(result.getPaidOutOnTermination());
      System.out.println(result.getAccrualWaitingPeriodDays());
      System.out.println(result.getCarryoverLimitHours());
      System.out.println(result.getMaxAccrualHoursPerYear());
      System.out.println(result.getMaxHours());
      System.out.println(result.getComplete());
      System.out.println(result.getIsActive());
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#addEmployeesToPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffPolicy> response = client
              .timeOffPolicies
              .addEmployeesToPolicy(timeOffPolicyUuid)
              .employees(employees)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#addEmployeesToPolicy");
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
| **timeOffPolicyUuid** | **String**| The UUID of the company time off policy | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **timeOffPoliciesAddEmployeesToPolicyRequest** | [**TimeOffPoliciesAddEmployeesToPolicyRequest**](TimeOffPoliciesAddEmployeesToPolicyRequest.md)| A list of employee objects containing the employee uuid | [optional] |

### Return type

[**TimeOffPolicy**](TimeOffPolicy.md)

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

<a name="calculateAccruingTimeOffHours"></a>
# **calculateAccruingTimeOffHours**
> List&lt;AccruingTimeOffHour&gt; calculateAccruingTimeOffHours(payrollId, employeeId).xGustoAPIVersion(xGustoAPIVersion).timeOffPoliciesCalculateAccruingTimeOffHoursRequest(timeOffPoliciesCalculateAccruingTimeOffHoursRequest).execute();

Calculate accruing time off hours

Returns a list of accruing time off for each time off policy associated with the employee.  Factors affecting the accrued hours:   * the time off policy accrual method (whether they get pay per hour worked, per hour paid, with / without overtime, accumulate time off based on pay period / calendar year / anniversary)   * how many hours of work during this pay period   * how many hours of PTO / sick hours taken during this pay period (for per hour paid policies only)   * company pay schedule frequency (for per pay period)  If none of the parameters is passed in, the accrued time off hour will be 0.  scope: &#x60;payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffPoliciesApi;
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
    String payrollId = "payrollId_example"; // The UUID of the payroll
    String employeeId = "employeeId_example"; // The UUID of the employee
    Double regularHoursWorked = 3.4D; // regular hours worked in this pay period
    Double overtimeHoursWorked = 3.4D; // overtime hours worked in this pay period
    Double doubleOvertimeHoursWorked = 3.4D; // double overtime hours worked in this pay period
    Double ptoHoursUsed = 3.4D; // paid time off hours used in this pay period
    Double sickHoursUsed = 3.4D; // sick hours used in this pay period
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<AccruingTimeOffHour> result = client
              .timeOffPolicies
              .calculateAccruingTimeOffHours(payrollId, employeeId)
              .regularHoursWorked(regularHoursWorked)
              .overtimeHoursWorked(overtimeHoursWorked)
              .doubleOvertimeHoursWorked(doubleOvertimeHoursWorked)
              .ptoHoursUsed(ptoHoursUsed)
              .sickHoursUsed(sickHoursUsed)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#calculateAccruingTimeOffHours");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AccruingTimeOffHour>> response = client
              .timeOffPolicies
              .calculateAccruingTimeOffHours(payrollId, employeeId)
              .regularHoursWorked(regularHoursWorked)
              .overtimeHoursWorked(overtimeHoursWorked)
              .doubleOvertimeHoursWorked(doubleOvertimeHoursWorked)
              .ptoHoursUsed(ptoHoursUsed)
              .sickHoursUsed(sickHoursUsed)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#calculateAccruingTimeOffHours");
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
| **payrollId** | **String**| The UUID of the payroll | |
| **employeeId** | **String**| The UUID of the employee | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **timeOffPoliciesCalculateAccruingTimeOffHoursRequest** | [**TimeOffPoliciesCalculateAccruingTimeOffHoursRequest**](TimeOffPoliciesCalculateAccruingTimeOffHoursRequest.md)|  | [optional] |

### Return type

[**List&lt;AccruingTimeOffHour&gt;**](AccruingTimeOffHour.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |

<a name="createPolicy"></a>
# **createPolicy**
> TimeOffPolicy createPolicy(companyUuid).xGustoAPIVersion(xGustoAPIVersion).timeOffPoliciesCreatePolicyRequest(timeOffPoliciesCreatePolicyRequest).execute();

Create a time off policy

Create a time off policy  scope: &#x60;time_off_policies:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffPoliciesApi;
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
    String name = "name_example"; // Name of the time off policy
    String policyType = "policyType_example"; // Type of the time off policy. Currently only \\\"vacation\\\" and \\\"sick\\\" are supported
    String accrualMethod = "unlimited"; // Accrual method of the time off policy
    String companyUuid = "companyUuid_example"; // The UUID of the company
    Float accrualRate = 3.4F; // The rate at which the time off hours will accrue for an employee on the policy. Represented as a float, e.g. \\\"40.0\\\".
    Float accrualRateUnit = 3.4F; // The number of hours an employee has to work or be paid for to accrue the number of hours set in the accrual rate. Only used for hourly policies (per_hour_paid, per_hour_paid_no_overtime, per_hour_work, per_hour_worked_no_overtime). Represented as a float, e.g. \\\"40.0\\\".
    Boolean paidOutOnTermination = true; // Boolean representing if an employees accrued time off hours will be paid out on termination
    Integer accrualWaitingPeriodDays = 56; // Number of days before an employee on the policy will begin accruing time off hours
    Float carryoverLimitHours = 3.4F; // The max number of hours and employee can carryover from one year to the next
    Float maxAccrualHoursPerYear = 3.4F; // The max number of hours and employee can accrue in a year
    Float maxHours = 3.4F; // The max number of hours an employee can accrue
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      TimeOffPolicy result = client
              .timeOffPolicies
              .createPolicy(name, policyType, accrualMethod, companyUuid)
              .accrualRate(accrualRate)
              .accrualRateUnit(accrualRateUnit)
              .paidOutOnTermination(paidOutOnTermination)
              .accrualWaitingPeriodDays(accrualWaitingPeriodDays)
              .carryoverLimitHours(carryoverLimitHours)
              .maxAccrualHoursPerYear(maxAccrualHoursPerYear)
              .maxHours(maxHours)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getName());
      System.out.println(result.getPolicyType());
      System.out.println(result.getAccrualMethod());
      System.out.println(result.getAccrualRate());
      System.out.println(result.getAccrualRateUnit());
      System.out.println(result.getPaidOutOnTermination());
      System.out.println(result.getAccrualWaitingPeriodDays());
      System.out.println(result.getCarryoverLimitHours());
      System.out.println(result.getMaxAccrualHoursPerYear());
      System.out.println(result.getMaxHours());
      System.out.println(result.getComplete());
      System.out.println(result.getIsActive());
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#createPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffPolicy> response = client
              .timeOffPolicies
              .createPolicy(name, policyType, accrualMethod, companyUuid)
              .accrualRate(accrualRate)
              .accrualRateUnit(accrualRateUnit)
              .paidOutOnTermination(paidOutOnTermination)
              .accrualWaitingPeriodDays(accrualWaitingPeriodDays)
              .carryoverLimitHours(carryoverLimitHours)
              .maxAccrualHoursPerYear(maxAccrualHoursPerYear)
              .maxHours(maxHours)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#createPolicy");
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
| **timeOffPoliciesCreatePolicyRequest** | [**TimeOffPoliciesCreatePolicyRequest**](TimeOffPoliciesCreatePolicyRequest.md)| Requires a policy name, a policy_type, and an accrual_method | [optional] |

### Return type

[**TimeOffPolicy**](TimeOffPolicy.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="deactivatePolicy"></a>
# **deactivatePolicy**
> TimeOffPolicy deactivatePolicy(timeOffPolicyUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Deactivate a time off policy

Deactivate a time off policy  scope: &#x60;time_off_policies:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffPoliciesApi;
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
    String timeOffPolicyUuid = "timeOffPolicyUuid_example"; // The UUID of the company time off policy
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      TimeOffPolicy result = client
              .timeOffPolicies
              .deactivatePolicy(timeOffPolicyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getName());
      System.out.println(result.getPolicyType());
      System.out.println(result.getAccrualMethod());
      System.out.println(result.getAccrualRate());
      System.out.println(result.getAccrualRateUnit());
      System.out.println(result.getPaidOutOnTermination());
      System.out.println(result.getAccrualWaitingPeriodDays());
      System.out.println(result.getCarryoverLimitHours());
      System.out.println(result.getMaxAccrualHoursPerYear());
      System.out.println(result.getMaxHours());
      System.out.println(result.getComplete());
      System.out.println(result.getIsActive());
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#deactivatePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffPolicy> response = client
              .timeOffPolicies
              .deactivatePolicy(timeOffPolicyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#deactivatePolicy");
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
| **timeOffPolicyUuid** | **String**| The UUID of the company time off policy | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**TimeOffPolicy**](TimeOffPolicy.md)

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

<a name="getAllPolicies"></a>
# **getAllPolicies**
> List&lt;TimeOffPolicy&gt; getAllPolicies(companyUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get all time off policies

Get all time off policies for a company  scope: &#x60;time_off_policies:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffPoliciesApi;
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
      List<TimeOffPolicy> result = client
              .timeOffPolicies
              .getAllPolicies(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#getAllPolicies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TimeOffPolicy>> response = client
              .timeOffPolicies
              .getAllPolicies(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#getAllPolicies");
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

[**List&lt;TimeOffPolicy&gt;**](TimeOffPolicy.md)

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

<a name="getPolicy"></a>
# **getPolicy**
> TimeOffPolicy getPolicy(timeOffPolicyUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a time off policy

Get a time off policy  scope: &#x60;time_off_policies:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffPoliciesApi;
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
    String timeOffPolicyUuid = "timeOffPolicyUuid_example"; // The UUID of the company time off policy
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      TimeOffPolicy result = client
              .timeOffPolicies
              .getPolicy(timeOffPolicyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getName());
      System.out.println(result.getPolicyType());
      System.out.println(result.getAccrualMethod());
      System.out.println(result.getAccrualRate());
      System.out.println(result.getAccrualRateUnit());
      System.out.println(result.getPaidOutOnTermination());
      System.out.println(result.getAccrualWaitingPeriodDays());
      System.out.println(result.getCarryoverLimitHours());
      System.out.println(result.getMaxAccrualHoursPerYear());
      System.out.println(result.getMaxHours());
      System.out.println(result.getComplete());
      System.out.println(result.getIsActive());
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#getPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffPolicy> response = client
              .timeOffPolicies
              .getPolicy(timeOffPolicyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#getPolicy");
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
| **timeOffPolicyUuid** | **String**| The UUID of the company time off policy | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**TimeOffPolicy**](TimeOffPolicy.md)

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

<a name="removeEmployees"></a>
# **removeEmployees**
> TimeOffPolicy removeEmployees(timeOffPolicyUuid).xGustoAPIVersion(xGustoAPIVersion).timeOffPoliciesRemoveEmployeesRequest(timeOffPoliciesRemoveEmployeesRequest).execute();

Remove employees from a time off policy

Remove employees from a time off policy  scope: &#x60;time_off_policies:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffPoliciesApi;
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
    String timeOffPolicyUuid = "timeOffPolicyUuid_example"; // The UUID of the company time off policy
    List<TimeOffPolicyEmployeesInner> employees = Arrays.asList();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      TimeOffPolicy result = client
              .timeOffPolicies
              .removeEmployees(timeOffPolicyUuid)
              .employees(employees)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getName());
      System.out.println(result.getPolicyType());
      System.out.println(result.getAccrualMethod());
      System.out.println(result.getAccrualRate());
      System.out.println(result.getAccrualRateUnit());
      System.out.println(result.getPaidOutOnTermination());
      System.out.println(result.getAccrualWaitingPeriodDays());
      System.out.println(result.getCarryoverLimitHours());
      System.out.println(result.getMaxAccrualHoursPerYear());
      System.out.println(result.getMaxHours());
      System.out.println(result.getComplete());
      System.out.println(result.getIsActive());
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#removeEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffPolicy> response = client
              .timeOffPolicies
              .removeEmployees(timeOffPolicyUuid)
              .employees(employees)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#removeEmployees");
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
| **timeOffPolicyUuid** | **String**| The UUID of the company time off policy | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **timeOffPoliciesRemoveEmployeesRequest** | [**TimeOffPoliciesRemoveEmployeesRequest**](TimeOffPoliciesRemoveEmployeesRequest.md)| A list of employee objects containing the employee uuid | [optional] |

### Return type

[**TimeOffPolicy**](TimeOffPolicy.md)

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

<a name="updateEmployeeBalance"></a>
# **updateEmployeeBalance**
> TimeOffPolicy updateEmployeeBalance(timeOffPolicyUuid).xGustoAPIVersion(xGustoAPIVersion).timeOffPoliciesUpdateEmployeeBalanceRequest(timeOffPoliciesUpdateEmployeeBalanceRequest).execute();

Update employee time off hour balances

Updates time off hours balances for employees for a time off policy  scope: &#x60;time_off_policies:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffPoliciesApi;
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
    String timeOffPolicyUuid = "timeOffPolicyUuid_example"; // The UUID of the company time off policy
    List<TimeOffPoliciesAddEmployeesToPolicyRequestEmployeesInner> employees = Arrays.asList();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      TimeOffPolicy result = client
              .timeOffPolicies
              .updateEmployeeBalance(timeOffPolicyUuid)
              .employees(employees)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getName());
      System.out.println(result.getPolicyType());
      System.out.println(result.getAccrualMethod());
      System.out.println(result.getAccrualRate());
      System.out.println(result.getAccrualRateUnit());
      System.out.println(result.getPaidOutOnTermination());
      System.out.println(result.getAccrualWaitingPeriodDays());
      System.out.println(result.getCarryoverLimitHours());
      System.out.println(result.getMaxAccrualHoursPerYear());
      System.out.println(result.getMaxHours());
      System.out.println(result.getComplete());
      System.out.println(result.getIsActive());
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#updateEmployeeBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffPolicy> response = client
              .timeOffPolicies
              .updateEmployeeBalance(timeOffPolicyUuid)
              .employees(employees)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#updateEmployeeBalance");
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
| **timeOffPolicyUuid** | **String**| The UUID of the company time off policy | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **timeOffPoliciesUpdateEmployeeBalanceRequest** | [**TimeOffPoliciesUpdateEmployeeBalanceRequest**](TimeOffPoliciesUpdateEmployeeBalanceRequest.md)| A list of employee objects containing the employee uuid and time off hours balance | [optional] |

### Return type

[**TimeOffPolicy**](TimeOffPolicy.md)

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

<a name="updatePolicy"></a>
# **updatePolicy**
> TimeOffPolicy updatePolicy(timeOffPolicyUuid).xGustoAPIVersion(xGustoAPIVersion).timeOffPoliciesUpdatePolicyRequest(timeOffPoliciesUpdatePolicyRequest).execute();

Update a time off policy

Update a time off policy  scope: &#x60;time_off_policies:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffPoliciesApi;
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
    String timeOffPolicyUuid = "timeOffPolicyUuid_example"; // The UUID of the company time off policy
    String name = "name_example"; // Name of the time off policy
    String accrualMethod = "unlimited"; // Accrual method of the time off policy
    Float accrualRate = 3.4F; // The rate at which the time off hours will accrue for an employee on the policy. Represented as a float, e.g. \\\"40.0\\\".
    Float accrualRateUnit = 3.4F; // The number of hours an employee has to work or be paid for to accrue the number of hours set in the accrual rate. Only used for hourly policies (per_hour_paid, per_hour_paid_no_overtime, per_hour_work, per_hour_worked_no_overtime). Represented as a float, e.g. \\\"40.0\\\".
    Boolean paidOutOnTermination = true; // Boolean representing if an employees accrued time off hours will be paid out on termination
    Integer accrualWaitingPeriodDays = 56; // Number of days before an employee on the policy will begin accruing time off hours
    Float carryoverLimitHours = 3.4F; // The max number of hours and employee can carryover from one year to the next
    Float maxAccrualHoursPerYear = 3.4F; // The max number of hours and employee can accrue in a year
    Float maxHours = 3.4F; // The max number of hours an employee can accrue
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      TimeOffPolicy result = client
              .timeOffPolicies
              .updatePolicy(timeOffPolicyUuid)
              .name(name)
              .accrualMethod(accrualMethod)
              .accrualRate(accrualRate)
              .accrualRateUnit(accrualRateUnit)
              .paidOutOnTermination(paidOutOnTermination)
              .accrualWaitingPeriodDays(accrualWaitingPeriodDays)
              .carryoverLimitHours(carryoverLimitHours)
              .maxAccrualHoursPerYear(maxAccrualHoursPerYear)
              .maxHours(maxHours)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getName());
      System.out.println(result.getPolicyType());
      System.out.println(result.getAccrualMethod());
      System.out.println(result.getAccrualRate());
      System.out.println(result.getAccrualRateUnit());
      System.out.println(result.getPaidOutOnTermination());
      System.out.println(result.getAccrualWaitingPeriodDays());
      System.out.println(result.getCarryoverLimitHours());
      System.out.println(result.getMaxAccrualHoursPerYear());
      System.out.println(result.getMaxHours());
      System.out.println(result.getComplete());
      System.out.println(result.getIsActive());
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#updatePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffPolicy> response = client
              .timeOffPolicies
              .updatePolicy(timeOffPolicyUuid)
              .name(name)
              .accrualMethod(accrualMethod)
              .accrualRate(accrualRate)
              .accrualRateUnit(accrualRateUnit)
              .paidOutOnTermination(paidOutOnTermination)
              .accrualWaitingPeriodDays(accrualWaitingPeriodDays)
              .carryoverLimitHours(carryoverLimitHours)
              .maxAccrualHoursPerYear(maxAccrualHoursPerYear)
              .maxHours(maxHours)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#updatePolicy");
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
| **timeOffPolicyUuid** | **String**| The UUID of the company time off policy | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **timeOffPoliciesUpdatePolicyRequest** | [**TimeOffPoliciesUpdatePolicyRequest**](TimeOffPoliciesUpdatePolicyRequest.md)| Can update any attributes of the time off policy except policy_type, is_active, complete &amp; employees | [optional] |

### Return type

[**TimeOffPolicy**](TimeOffPolicy.md)

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

