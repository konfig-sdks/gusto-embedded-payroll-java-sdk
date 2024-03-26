# PayrollsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approvedReversals**](PayrollsApi.md#approvedReversals) | **GET** /v1/companies/{company_id}/payroll_reversals | Get approved payroll reversals |
| [**calculateGrossUp**](PayrollsApi.md#calculateGrossUp) | **POST** /v1/payrolls/{payroll_uuid}/gross_up | Calculate gross up |
| [**calculateGrossUp_0**](PayrollsApi.md#calculateGrossUp_0) | **PUT** /v1/companies/{company_id}/payrolls/{payroll_id}/calculate | Calculate a payroll |
| [**cancelPayrollTransition**](PayrollsApi.md#cancelPayrollTransition) | **PUT** /v1/companies/{company_id}/payrolls/{payroll_id}/cancel | Cancel a payroll |
| [**createOffCyclePayroll**](PayrollsApi.md#createOffCyclePayroll) | **POST** /v1/companies/{company_id}/payrolls | Create an off-cycle payroll |
| [**deleteUnprocessedPayroll**](PayrollsApi.md#deleteUnprocessedPayroll) | **DELETE** /v1/companies/{company_id}/payrolls/{payroll_id} | Delete a payroll |
| [**generatePrintableChecks**](PayrollsApi.md#generatePrintableChecks) | **POST** /v1/payrolls/{payroll_id}/generated_documents/printable_payroll_checks | Generate payroll printable checks (pdf) |
| [**getAllPayrollBlockers**](PayrollsApi.md#getAllPayrollBlockers) | **GET** /v1/companies/{company_uuid}/payrolls/blockers | Get all payroll blockers for a company |
| [**getCompanyPayrolls**](PayrollsApi.md#getCompanyPayrolls) | **GET** /v1/companies/{company_id}/payrolls | Get all payrolls for a company |
| [**getEmployeePayStub**](PayrollsApi.md#getEmployeePayStub) | **GET** /v1/payrolls/{payroll_id}/employees/{employee_id}/pay_stub | Get an employee pay stub (pdf) |
| [**getEmployeePayStubs**](PayrollsApi.md#getEmployeePayStubs) | **GET** /v1/employees/{employee_id}/pay_stubs | Get an employee&#39;s pay stubs |
| [**getSinglePayroll**](PayrollsApi.md#getSinglePayroll) | **GET** /v1/companies/{company_id}/payrolls/{payroll_id} | Get a single payroll |
| [**getSingleReceipt**](PayrollsApi.md#getSingleReceipt) | **GET** /v1/payrolls/{payroll_uuid}/receipt | Get a single payroll receipt |
| [**prepareForUpdate**](PayrollsApi.md#prepareForUpdate) | **PUT** /v1/companies/{company_id}/payrolls/{payroll_id}/prepare | Prepare a payroll for update |
| [**skipPayroll**](PayrollsApi.md#skipPayroll) | **POST** /v1/companies/{company_uuid}/payrolls/skip | Skip a payroll |
| [**submitPayroll**](PayrollsApi.md#submitPayroll) | **PUT** /v1/companies/{company_id}/payrolls/{payroll_id}/submit | Submit payroll |
| [**updatePayrollById**](PayrollsApi.md#updatePayrollById) | **PUT** /v1/companies/{company_id}/payrolls/{payroll_id} | Update a payroll by ID |


<a name="approvedReversals"></a>
# **approvedReversals**
> PayrollReversal approvedReversals(companyId).page(page).per(per).xGustoAPIVersion(xGustoAPIVersion).execute();

Get approved payroll reversals

Returns all approved Payroll Reversals for a Company.  scope: &#x60;payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
      PayrollReversal result = client
              .payrolls
              .approvedReversals(companyId)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getReversedPayrollUuid());
      System.out.println(result.getReversalPayrollUuid());
      System.out.println(result.getReason());
      System.out.println(result.getApprovedAt());
      System.out.println(result.getCategory());
      System.out.println(result.getReversedEmployeeUuids());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#approvedReversals");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayrollReversal> response = client
              .payrolls
              .approvedReversals(companyId)
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
      System.err.println("Exception when calling PayrollsApi#approvedReversals");
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

[**PayrollReversal**](PayrollReversal.md)

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

<a name="calculateGrossUp"></a>
# **calculateGrossUp**
> GrossUpPay calculateGrossUp(payrollUuid).xGustoAPIVersion(xGustoAPIVersion).payrollsCalculateGrossUpRequest(payrollsCalculateGrossUpRequest).execute();

Calculate gross up

Calculates gross up earnings for an employee&#39;s payroll, given net earnings. This endpoint is only applicable to off-cycle unprocessed payrolls.  The gross up amount must then be mapped to the corresponding fixed compensation earning type to get the correct payroll amount. For example, for bonus off-cycles, the gross up amount should be set with the Bonus earning type in the payroll &#x60;fixed_compensations&#x60; field.  scope: &#x60;payrolls:run&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    String employeeUuid = "employeeUuid_example"; // Employee UUID
    String netPay = "netPay_example"; // Employee net earnings
    String payrollUuid = "payrollUuid_example"; // The UUID of the payroll
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      GrossUpPay result = client
              .payrolls
              .calculateGrossUp(employeeUuid, netPay, payrollUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getGrossUp());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#calculateGrossUp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GrossUpPay> response = client
              .payrolls
              .calculateGrossUp(employeeUuid, netPay, payrollUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#calculateGrossUp");
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
| **payrollUuid** | **String**| The UUID of the payroll | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **payrollsCalculateGrossUpRequest** | [**PayrollsCalculateGrossUpRequest**](PayrollsCalculateGrossUpRequest.md)|  | [optional] |

### Return type

[**GrossUpPay**](GrossUpPay.md)

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

<a name="calculateGrossUp_0"></a>
# **calculateGrossUp_0**
> calculateGrossUp_0(companyId, payrollId).xGustoAPIVersion(xGustoAPIVersion).execute();

Calculate a payroll

Performs calculations for taxes, benefits, and deductions for an unprocessed payroll. The calculated payroll details provide a preview of the actual values that will be used when the payroll is run.  This calculation is asynchronous and a successful request responds with a 202 HTTP status. To view the details of the calculated payroll, use the GET /v1/companies/{company_id}/payrolls/{payroll_id} endpoint with *include&#x3D;taxes,benefits,deductions* params. In v2023-04-01, *show_calculation&#x3D;true* is no longer required.  If the company is blocked from running payroll due to issues like incomplete setup, missing information or other compliance issues, the response will be 422 Unprocessable Entity with a categorization of the blockers as described in the error responses.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    String payrollId = "payrollId_example"; // The UUID of the payroll
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .payrolls
              .calculateGrossUp_0(companyId, payrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#calculateGrossUp_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payrolls
              .calculateGrossUp_0(companyId, payrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#calculateGrossUp_0");
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
| **payrollId** | **String**| The UUID of the payroll | |
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

<a name="cancelPayrollTransition"></a>
# **cancelPayrollTransition**
> Payroll cancelPayrollTransition(companyId, payrollId).xGustoAPIVersion(xGustoAPIVersion).execute();

Cancel a payroll

Transitions a &#x60;processed&#x60; payroll back to the &#x60;unprocessed&#x60; state. A payroll can be canceled if it meets both criteria: - &#x60;processed&#x60; is true - Current time is earlier than 3:30pm PT on the payroll_deadline  scope: &#x60;payrolls:run&#x60; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    String payrollId = "payrollId_example"; // The UUID of the payroll
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Payroll result = client
              .payrolls
              .cancelPayrollTransition(companyId, payrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayrollDeadline());
      System.out.println(result.getCheckDate());
      System.out.println(result.getProcessed());
      System.out.println(result.getProcessedDate());
      System.out.println(result.getCalculatedAt());
      System.out.println(result.getPayrollUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getOffCycle());
      System.out.println(result.getOffCycleReason());
      System.out.println(result.getExternal());
      System.out.println(result.getFinalTerminationPayroll());
      System.out.println(result.getWithholdingPayPeriod());
      System.out.println(result.getSkipRegularDeductions());
      System.out.println(result.getFixedWithholdingRate());
      System.out.println(result.getPayPeriod());
      System.out.println(result.getPayrollStatusMeta());
      System.out.println(result.getTotals());
      System.out.println(result.getEmployeeCompensations());
      System.out.println(result.getCompanyTaxes());
      System.out.println(result.getPaymentSpeedChanged());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#cancelPayrollTransition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Payroll> response = client
              .payrolls
              .cancelPayrollTransition(companyId, payrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#cancelPayrollTransition");
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
| **payrollId** | **String**| The UUID of the payroll | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**Payroll**](Payroll.md)

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

<a name="createOffCyclePayroll"></a>
# **createOffCyclePayroll**
> PayrollPrepared createOffCyclePayroll(companyId).xGustoAPIVersion(xGustoAPIVersion).payrollsCreateOffCyclePayrollRequest(payrollsCreateOffCyclePayrollRequest).execute();

Create an off-cycle payroll

Creates a new, unprocessed, off-cycle payroll.  ## &#x60;off_cycle_reason&#x60; - External benefits and deductions will be included when the &#x60;off_cycle_reason&#x60; is set to &#x60;Correction&#x60;. - All benefits and deductions are blocked when the &#x60;off_cycle_reason&#x60; is set to &#x60;Bonus&#x60;.  scope: &#x60;payrolls:run&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    Boolean offCycle = true; // Whether it is an off cycle payroll.
    String offCycleReason = "Bonus"; // An off cycle payroll reason. Select one from the following list.
    String startDate = "startDate_example"; // Pay period start date.
    String endDate = "endDate_example"; // Pay period end date.
    String companyId = "companyId_example"; // The UUID of the company
    String payScheduleUuid = "payScheduleUuid_example"; // A pay schedule is required for Transition from old pay schedule payroll to identify the matching transition pay period.
    List<String> employeeUuids = Arrays.asList(); // A list of employee uuids to include on the payroll.
    String checkDate = "checkDate_example"; // Payment date.
    String withholdingPayPeriod = "Every week"; // The payment schedule tax rate the payroll is based on
    Boolean skipRegularDeductions = true; // Block regular deductions and contributions for this payroll.
    Boolean fixedWithholdingRate = true; // Enable taxes to be withheld at the IRS's required rate of 22% for federal income taxes. State income taxes will be taxed at the state's supplemental tax rate. Otherwise, we'll sum the entirety of the employee's wages and withhold taxes on the entire amount at the rate for regular wages.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      PayrollPrepared result = client
              .payrolls
              .createOffCyclePayroll(offCycle, offCycleReason, startDate, endDate, companyId)
              .payScheduleUuid(payScheduleUuid)
              .employeeUuids(employeeUuids)
              .checkDate(checkDate)
              .withholdingPayPeriod(withholdingPayPeriod)
              .skipRegularDeductions(skipRegularDeductions)
              .fixedWithholdingRate(fixedWithholdingRate)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayrollDeadline());
      System.out.println(result.getCheckDate());
      System.out.println(result.getProcessed());
      System.out.println(result.getProcessedDate());
      System.out.println(result.getCalculatedAt());
      System.out.println(result.getPayrollUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getOffCycle());
      System.out.println(result.getOffCycleReason());
      System.out.println(result.getExternal());
      System.out.println(result.getFinalTerminationPayroll());
      System.out.println(result.getWithholdingPayPeriod());
      System.out.println(result.getSkipRegularDeductions());
      System.out.println(result.getFixedWithholdingRate());
      System.out.println(result.getPayPeriod());
      System.out.println(result.getPayrollStatusMeta());
      System.out.println(result.getEmployeeCompensations());
      System.out.println(result.getPaymentSpeedChanged());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getFixedCompensationTypes());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#createOffCyclePayroll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayrollPrepared> response = client
              .payrolls
              .createOffCyclePayroll(offCycle, offCycleReason, startDate, endDate, companyId)
              .payScheduleUuid(payScheduleUuid)
              .employeeUuids(employeeUuids)
              .checkDate(checkDate)
              .withholdingPayPeriod(withholdingPayPeriod)
              .skipRegularDeductions(skipRegularDeductions)
              .fixedWithholdingRate(fixedWithholdingRate)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#createOffCyclePayroll");
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
| **payrollsCreateOffCyclePayrollRequest** | [**PayrollsCreateOffCyclePayrollRequest**](PayrollsCreateOffCyclePayrollRequest.md)|  | [optional] |

### Return type

[**PayrollPrepared**](PayrollPrepared.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A prepared payroll |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="deleteUnprocessedPayroll"></a>
# **deleteUnprocessedPayroll**
> deleteUnprocessedPayroll(companyId, payrollId).async(async).xGustoAPIVersion(xGustoAPIVersion).execute();

Delete a payroll

This endpoint allows you to delete an **unprocessed** payroll.  By default the payroll and associated data is deleted synchronously. To request an asynchronous delete, use the &#x60;async&#x3D;true&#x60; query parameter. In both cases validation of ability to delete will be performed and an Unprocessable Entity error will be returned if the payroll is not able to be deleted. A successful synchronous delete will return &#x60;204/No Content&#x60;. When a payroll has been enqueued for asynchronous deletion, &#x60;202/Accepted&#x60; will be returned.  scope: &#x60;payrolls:run&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    String payrollId = "payrollId_example"; // The UUID of the payroll
    Boolean async = true; // When true, request an asynchronous delete of the payroll.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .payrolls
              .deleteUnprocessedPayroll(companyId, payrollId)
              .async(async)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#deleteUnprocessedPayroll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payrolls
              .deleteUnprocessedPayroll(companyId, payrollId)
              .async(async)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#deleteUnprocessedPayroll");
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
| **payrollId** | **String**| The UUID of the payroll | |
| **async** | **Boolean**| When true, request an asynchronous delete of the payroll. | [optional] |
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
| **202** | Accepted |  -  |
| **204** | No Content |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |
| **422** | Unprocessable Entity |  -  |

<a name="generatePrintableChecks"></a>
# **generatePrintableChecks**
> PayrollCheck generatePrintableChecks(payrollId).xGustoAPIVersion(xGustoAPIVersion).payrollsGeneratePrintableChecksRequest(payrollsGeneratePrintableChecksRequest).execute();

Generate payroll printable checks (pdf)

This endpoint initiates the generation of employee checks for the payroll specified by payroll_id. A generation status and corresponding generated document request_uuid will be returned. Use the generated document GET endpoint with document_type: &#x60;printable_payroll_checks&#x60; and request_uuid to poll the check generation process and retrieve the generated check URL upon completion.  scope: &#x60;generated_documents:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    String printingFormat = "printingFormat_example"; // The type of check stock being printed. Check this [link](https://support.gusto.com/article/999877761000000/Pay-your-team-by-check) for more info on check types
    String payrollId = "payrollId_example"; // The UUID of the payroll
    Integer startingCheckNumber = 56; // The starting check number for the checks being generated
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      PayrollCheck result = client
              .payrolls
              .generatePrintableChecks(printingFormat, payrollId)
              .startingCheckNumber(startingCheckNumber)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayrollUuid());
      System.out.println(result.getPrintingFormat());
      System.out.println(result.getStartingCheckNumber());
      System.out.println(result.getRequestUuid());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#generatePrintableChecks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayrollCheck> response = client
              .payrolls
              .generatePrintableChecks(printingFormat, payrollId)
              .startingCheckNumber(startingCheckNumber)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#generatePrintableChecks");
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
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **payrollsGeneratePrintableChecksRequest** | [**PayrollsGeneratePrintableChecksRequest**](PayrollsGeneratePrintableChecksRequest.md)|  | [optional] |

### Return type

[**PayrollCheck**](PayrollCheck.md)

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

<a name="getAllPayrollBlockers"></a>
# **getAllPayrollBlockers**
> List&lt;PayrollBlocker&gt; getAllPayrollBlockers(companyUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get all payroll blockers for a company

Returns a list of reasons that prevent the company from running payrolls. See the [payroll blockers guide](https://docs.gusto.com/embedded-payroll/docs/payroll-blockers) for a complete list of reasons.  The list is empty if there are no payroll blockers.  scope: &#x60;payrolls:run&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
      List<PayrollBlocker> result = client
              .payrolls
              .getAllPayrollBlockers(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#getAllPayrollBlockers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PayrollBlocker>> response = client
              .payrolls
              .getAllPayrollBlockers(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#getAllPayrollBlockers");
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

[**List&lt;PayrollBlocker&gt;**](PayrollBlocker.md)

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

<a name="getCompanyPayrolls"></a>
# **getCompanyPayrolls**
> List&lt;PayrollMinimal&gt; getCompanyPayrolls(companyId).processingStatuses(processingStatuses).payrollTypes(payrollTypes).include(include).startDate(startDate).endDate(endDate).xGustoAPIVersion(xGustoAPIVersion).execute();

Get all payrolls for a company

Returns a list of payrolls for a company. You can change the payrolls returned by updating the processing_status, payroll_types, start_date, &amp; end_date params.  By default, will return processed, regular payrolls for the past 6 months.  Notes: * Dollar amounts are returned as string representations of numeric decimals, are represented to the cent. * end_date can be at most 3 months in the future and start_date and end_date can&#39;t be more than 1 year apart.  scope: &#x60;payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    String processingStatuses = "unprocessed"; // Whether to include processed and/or unprocessed payrolls in the response, defaults to processed, for multiple attributes comma separate the values, i.e. `?processing_statuses=processed,unprocessed`
    String payrollTypes = "regular"; // Whether to include regular and/or off_cycle payrolls in the response, defaults to regular, for multiple attributes comma separate the values, i.e. `?payroll_types=regular,off_cycle`
    String include = "totals"; // Include the requested attribute in the response. In v2023-04-01 totals are no longer included by default. For multiple attributes comma separate the values, i.e. `?include=totals,payroll_status_meta`
    String startDate = "startDate_example"; // Return payrolls whose pay period is after the start date
    String endDate = "endDate_example"; // Return payrolls whose pay period is before the end date
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<PayrollMinimal> result = client
              .payrolls
              .getCompanyPayrolls(companyId)
              .processingStatuses(processingStatuses)
              .payrollTypes(payrollTypes)
              .include(include)
              .startDate(startDate)
              .endDate(endDate)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#getCompanyPayrolls");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PayrollMinimal>> response = client
              .payrolls
              .getCompanyPayrolls(companyId)
              .processingStatuses(processingStatuses)
              .payrollTypes(payrollTypes)
              .include(include)
              .startDate(startDate)
              .endDate(endDate)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#getCompanyPayrolls");
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
| **processingStatuses** | **String**| Whether to include processed and/or unprocessed payrolls in the response, defaults to processed, for multiple attributes comma separate the values, i.e. &#x60;?processing_statuses&#x3D;processed,unprocessed&#x60; | [optional] [enum: unprocessed, processed] |
| **payrollTypes** | **String**| Whether to include regular and/or off_cycle payrolls in the response, defaults to regular, for multiple attributes comma separate the values, i.e. &#x60;?payroll_types&#x3D;regular,off_cycle&#x60; | [optional] [enum: regular, off_cycle, external] |
| **include** | **String**| Include the requested attribute in the response. In v2023-04-01 totals are no longer included by default. For multiple attributes comma separate the values, i.e. &#x60;?include&#x3D;totals,payroll_status_meta&#x60; | [optional] [enum: totals, payroll_status_meta] |
| **startDate** | **String**| Return payrolls whose pay period is after the start date | [optional] |
| **endDate** | **String**| Return payrolls whose pay period is before the end date | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**List&lt;PayrollMinimal&gt;**](PayrollMinimal.md)

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

<a name="getEmployeePayStub"></a>
# **getEmployeePayStub**
> getEmployeePayStub(payrollId, employeeId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get an employee pay stub (pdf)

Get an employee&#39;s pay stub for the specified payroll. By default, an application/pdf response will be returned. No other content types are currently supported, but may be supported in the future.  scope: &#x60;pay_stubs:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .payrolls
              .getEmployeePayStub(payrollId, employeeId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#getEmployeePayStub");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payrolls
              .getEmployeePayStub(payrollId, employeeId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#getEmployeePayStub");
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
| **200** | OK |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getEmployeePayStubs"></a>
# **getEmployeePayStubs**
> List&lt;EmployeePayStub&gt; getEmployeePayStubs(employeeId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get an employee&#39;s pay stubs

Get an employee&#39;s pay stubs  scope: &#x60;pay_stubs:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<EmployeePayStub> result = client
              .payrolls
              .getEmployeePayStubs(employeeId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#getEmployeePayStubs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeePayStub>> response = client
              .payrolls
              .getEmployeePayStubs(employeeId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#getEmployeePayStubs");
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

### Return type

[**List&lt;EmployeePayStub&gt;**](EmployeePayStub.md)

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

<a name="getSinglePayroll"></a>
# **getSinglePayroll**
> Payroll getSinglePayroll(companyId, payrollId).include(include).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a single payroll

Returns a payroll. If payroll is calculated or processed, will return employee_compensations and totals.  Notes: * Hour and dollar amounts are returned as string representations of numeric decimals. * Hours are represented to the thousands place; dollar amounts are represented to the cent. * Every eligible compensation is returned for each employee. If no data has yet be inserted for a given field, it defaults to “0.00” (for fixed amounts) or “0.000” (for hours ). * When include parameter with benefits value is passed, employee_benefits:read scope is required to return benefits   * Benefits containing PHI are only visible with the &#x60;employee_benefits:read:phi&#x60; scope  scope: &#x60;payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    String payrollId = "payrollId_example"; // The UUID of the payroll
    String include = "benefits"; // Include the requested attribute in the response, for multiple attributes comma separate the values, i.e. `?include=benefits,deductions,taxes`
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Payroll result = client
              .payrolls
              .getSinglePayroll(companyId, payrollId)
              .include(include)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayrollDeadline());
      System.out.println(result.getCheckDate());
      System.out.println(result.getProcessed());
      System.out.println(result.getProcessedDate());
      System.out.println(result.getCalculatedAt());
      System.out.println(result.getPayrollUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getOffCycle());
      System.out.println(result.getOffCycleReason());
      System.out.println(result.getExternal());
      System.out.println(result.getFinalTerminationPayroll());
      System.out.println(result.getWithholdingPayPeriod());
      System.out.println(result.getSkipRegularDeductions());
      System.out.println(result.getFixedWithholdingRate());
      System.out.println(result.getPayPeriod());
      System.out.println(result.getPayrollStatusMeta());
      System.out.println(result.getTotals());
      System.out.println(result.getEmployeeCompensations());
      System.out.println(result.getCompanyTaxes());
      System.out.println(result.getPaymentSpeedChanged());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#getSinglePayroll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Payroll> response = client
              .payrolls
              .getSinglePayroll(companyId, payrollId)
              .include(include)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#getSinglePayroll");
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
| **payrollId** | **String**| The UUID of the payroll | |
| **include** | **String**| Include the requested attribute in the response, for multiple attributes comma separate the values, i.e. &#x60;?include&#x3D;benefits,deductions,taxes&#x60; | [optional] [enum: benefits, deductions, taxes, payroll_status_meta] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**Payroll**](Payroll.md)

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
> PayrollReceipt getSingleReceipt(payrollUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a single payroll receipt

Returns a payroll receipt.  Notes: * Hour and dollar amounts are returned as string representations of numeric decimals. * Dollar amounts are represented to the cent. * If no data has yet be inserted for a given field, it defaults to “0.00” (for fixed amounts).  scope: &#x60;payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    String payrollUuid = "payrollUuid_example"; // The UUID of the payroll
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      PayrollReceipt result = client
              .payrolls
              .getSingleReceipt(payrollUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayrollUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getNameOfSender());
      System.out.println(result.getNameOfRecipient());
      System.out.println(result.getRecipientNotice());
      System.out.println(result.getDebitDate());
      System.out.println(result.getLicense());
      System.out.println(result.getLicenseUri());
      System.out.println(result.getRightToRefund());
      System.out.println(result.getLiabilityOfLicensee());
      System.out.println(result.getTotals());
      System.out.println(result.getTaxes());
      System.out.println(result.getEmployeeCompensations());
      System.out.println(result.getLicensee());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#getSingleReceipt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayrollReceipt> response = client
              .payrolls
              .getSingleReceipt(payrollUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#getSingleReceipt");
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
| **payrollUuid** | **String**| The UUID of the payroll | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**PayrollReceipt**](PayrollReceipt.md)

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

<a name="prepareForUpdate"></a>
# **prepareForUpdate**
> PayrollPrepared prepareForUpdate(companyId, payrollId).xGustoAPIVersion(xGustoAPIVersion).execute();

Prepare a payroll for update

This endpoint will build the payroll and get it ready for making updates. This includes adding/removing eligible employees from the Payroll and updating the check_date, payroll_deadline, and payroll_status_meta dates &amp; times.  Notes:  * Will null out calculated_at &amp; totals if a payroll has already been calculated.  * Will return the version param used for updating the payroll  scope: &#x60;payrolls:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    String payrollId = "payrollId_example"; // The UUID of the payroll
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      PayrollPrepared result = client
              .payrolls
              .prepareForUpdate(companyId, payrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayrollDeadline());
      System.out.println(result.getCheckDate());
      System.out.println(result.getProcessed());
      System.out.println(result.getProcessedDate());
      System.out.println(result.getCalculatedAt());
      System.out.println(result.getPayrollUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getOffCycle());
      System.out.println(result.getOffCycleReason());
      System.out.println(result.getExternal());
      System.out.println(result.getFinalTerminationPayroll());
      System.out.println(result.getWithholdingPayPeriod());
      System.out.println(result.getSkipRegularDeductions());
      System.out.println(result.getFixedWithholdingRate());
      System.out.println(result.getPayPeriod());
      System.out.println(result.getPayrollStatusMeta());
      System.out.println(result.getEmployeeCompensations());
      System.out.println(result.getPaymentSpeedChanged());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getFixedCompensationTypes());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#prepareForUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayrollPrepared> response = client
              .payrolls
              .prepareForUpdate(companyId, payrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#prepareForUpdate");
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
| **payrollId** | **String**| The UUID of the payroll | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**PayrollPrepared**](PayrollPrepared.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A prepared payroll |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="skipPayroll"></a>
# **skipPayroll**
> skipPayroll(companyUuid).xGustoAPIVersion(xGustoAPIVersion).payrollsSkipPayrollRequest(payrollsSkipPayrollRequest).execute();

Skip a payroll

Submits a $0 payroll for employees associated with the pay schedule to skip payroll. This submission is asynchronous and a successful request responds with a 202 HTTP status. Upon success, the payroll is transitioned to the &#x60;processed&#x60; state.  If the company is blocked from running payroll due to issues like incomplete setup, missing information or other compliance issues, the response will be 422 Unprocessable Entity with a categorization of the blockers as described in the error responses.  scope: &#x60;payrolls:run&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    String payrollType = "Regular"; // Payroll type
    String companyUuid = "companyUuid_example"; // The UUID of the company
    String startDate = "startDate_example"; // Pay period start date
    String endDate = "endDate_example"; // Pay period end date
    String payScheduleUuid = "payScheduleUuid_example"; // The UUID of the pay schedule
    List<String> employeeUuids = Arrays.asList(); // An array of employees. This field is only applicable to new hire payroll and termination payroll
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .payrolls
              .skipPayroll(payrollType, companyUuid)
              .startDate(startDate)
              .endDate(endDate)
              .payScheduleUuid(payScheduleUuid)
              .employeeUuids(employeeUuids)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#skipPayroll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payrolls
              .skipPayroll(payrollType, companyUuid)
              .startDate(startDate)
              .endDate(endDate)
              .payScheduleUuid(payScheduleUuid)
              .employeeUuids(employeeUuids)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#skipPayroll");
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
| **payrollsSkipPayrollRequest** | [**PayrollsSkipPayrollRequest**](PayrollsSkipPayrollRequest.md)|  | [optional] |

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
| **202** | Accepted |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="submitPayroll"></a>
# **submitPayroll**
> submitPayroll(companyId, payrollId).xGustoAPIVersion(xGustoAPIVersion).execute();

Submit payroll

Submits an unprocessed payroll to be calculated and run. This submission is asynchronous and a successful request responds with a 202 HTTP status. Upon success, transitions the payroll to the &#x60;processed&#x60; state.  If the company is blocked from running payroll due to issues like incomplete setup, missing information or other compliance issues, the response will be 422 Unprocessable Entity with a categorization of the blockers as described in the error responses.  scope: &#x60;payrolls:run&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    String payrollId = "payrollId_example"; // The UUID of the payroll
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .payrolls
              .submitPayroll(companyId, payrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#submitPayroll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payrolls
              .submitPayroll(companyId, payrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#submitPayroll");
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
| **payrollId** | **String**| The UUID of the payroll | |
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

<a name="updatePayrollById"></a>
# **updatePayrollById**
> PayrollPrepared updatePayrollById(companyId, payrollId).xGustoAPIVersion(xGustoAPIVersion).payrollsUpdatePayrollByIdRequest(payrollsUpdatePayrollByIdRequest).execute();

Update a payroll by ID

This endpoint allows you to update information for one or more employees for a specific **unprocessed** payroll.  You can think of the **unprocessed** payroll object as a template of fields that you can update.  You cannot modify the structure of the payroll object through this endpoint, only values of the fields included in the payroll.  If you do not include specific employee compensations or fixed/hourly compensations in your request body, they will not be removed from the payroll.  scope: &#x60;payrolls:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    List<PayrollsUpdatePayrollByIdRequestEmployeeCompensationsInner> employeeCompensations = Arrays.asList();
    String companyId = "companyId_example"; // The UUID of the company
    String payrollId = "payrollId_example"; // The UUID of the payroll
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      PayrollPrepared result = client
              .payrolls
              .updatePayrollById(employeeCompensations, companyId, payrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayrollDeadline());
      System.out.println(result.getCheckDate());
      System.out.println(result.getProcessed());
      System.out.println(result.getProcessedDate());
      System.out.println(result.getCalculatedAt());
      System.out.println(result.getPayrollUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getOffCycle());
      System.out.println(result.getOffCycleReason());
      System.out.println(result.getExternal());
      System.out.println(result.getFinalTerminationPayroll());
      System.out.println(result.getWithholdingPayPeriod());
      System.out.println(result.getSkipRegularDeductions());
      System.out.println(result.getFixedWithholdingRate());
      System.out.println(result.getPayPeriod());
      System.out.println(result.getPayrollStatusMeta());
      System.out.println(result.getEmployeeCompensations());
      System.out.println(result.getPaymentSpeedChanged());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getFixedCompensationTypes());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#updatePayrollById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayrollPrepared> response = client
              .payrolls
              .updatePayrollById(employeeCompensations, companyId, payrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#updatePayrollById");
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
| **payrollId** | **String**| The UUID of the payroll | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **payrollsUpdatePayrollByIdRequest** | [**PayrollsUpdatePayrollByIdRequest**](PayrollsUpdatePayrollByIdRequest.md)|  | [optional] |

### Return type

[**PayrollPrepared**](PayrollPrepared.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A prepared payroll |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

