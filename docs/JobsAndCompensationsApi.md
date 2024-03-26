# JobsAndCompensationsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCompensation**](JobsAndCompensationsApi.md#createCompensation) | **POST** /v1/jobs/{job_id}/compensations | Create a compensation |
| [**createJob**](JobsAndCompensationsApi.md#createJob) | **POST** /v1/employees/{employee_id}/jobs | Create a job |
| [**deleteJobById**](JobsAndCompensationsApi.md#deleteJobById) | **DELETE** /v1/jobs/{job_id} | Delete an individual job |
| [**getCompensationById**](JobsAndCompensationsApi.md#getCompensationById) | **GET** /v1/compensations/{compensation_id} | Get a compensation |
| [**getEmployeeJobs**](JobsAndCompensationsApi.md#getEmployeeJobs) | **GET** /v1/employees/{employee_id}/jobs | Get jobs for an employee |
| [**getJobCompensations**](JobsAndCompensationsApi.md#getJobCompensations) | **GET** /v1/jobs/{job_id}/compensations | Get compensations for a job |
| [**getJobDetails**](JobsAndCompensationsApi.md#getJobDetails) | **GET** /v1/jobs/{job_id} | Get a job |
| [**removeCompensation**](JobsAndCompensationsApi.md#removeCompensation) | **DELETE** /v1/compensations/{compensation_id} | Delete a compensation |
| [**updateCompensation**](JobsAndCompensationsApi.md#updateCompensation) | **PUT** /v1/compensations/{compensation_id} | Update a compensation |
| [**updateJob**](JobsAndCompensationsApi.md#updateJob) | **PUT** /v1/jobs/{job_id} | Update a job |


<a name="createCompensation"></a>
# **createCompensation**
> Compensation createCompensation(jobId).xGustoAPIVersion(xGustoAPIVersion).jobsAndCompensationsCreateCompensationRequest(jobsAndCompensationsCreateCompensationRequest).execute();

Create a compensation

Compensations contain information on how much is paid out for a job. Jobs may have many compensations, but only one that is active. The current compensation is the one with the most recent &#x60;effective_date&#x60;.  scope: &#x60;jobs:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsAndCompensationsApi;
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
    String paymentUnit = "Hour"; // The unit accompanying the compensation rate. If the employee is an owner, rate should be 'Paycheck'.
    FlsaStatusType flsaStatus = FlsaStatusType.fromValue("Exempt");
    String jobId = "jobId_example"; // The UUID of the job
    String rate = "rate_example"; // The dollar amount paid per payment unit.
    String effectiveDate = "effectiveDate_example"; // The date when the compensation takes effect.
    Boolean adjustForMinimumWage = true; // Determines whether the compensation should be adjusted for minimum wage. Only applies to Nonexempt employees.
    List<JobsAndCompensationsCreateCompensationRequestMinimumWagesInner> minimumWages = Arrays.asList();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Compensation result = client
              .jobsAndCompensations
              .createCompensation(paymentUnit, flsaStatus, jobId)
              .rate(rate)
              .effectiveDate(effectiveDate)
              .adjustForMinimumWage(adjustForMinimumWage)
              .minimumWages(minimumWages)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getJobUuid());
      System.out.println(result.getRate());
      System.out.println(result.getPaymentUnit());
      System.out.println(result.getFlsaStatus());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getAdjustForMinimumWage());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#createCompensation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Compensation> response = client
              .jobsAndCompensations
              .createCompensation(paymentUnit, flsaStatus, jobId)
              .rate(rate)
              .effectiveDate(effectiveDate)
              .adjustForMinimumWage(adjustForMinimumWage)
              .minimumWages(minimumWages)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#createCompensation");
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
| **jobId** | **String**| The UUID of the job | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **jobsAndCompensationsCreateCompensationRequest** | [**JobsAndCompensationsCreateCompensationRequest**](JobsAndCompensationsCreateCompensationRequest.md)|  | [optional] |

### Return type

[**Compensation**](Compensation.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="createJob"></a>
# **createJob**
> Job createJob(employeeId).xGustoAPIVersion(xGustoAPIVersion).jobsAndCompensationsCreateJobRequest(jobsAndCompensationsCreateJobRequest).execute();

Create a job

Create a job.  scope: &#x60;jobs:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsAndCompensationsApi;
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
    String title = "title_example"; // The job title
    String hireDate = "hireDate_example"; // The date when the employee was hired or rehired for the job.
    String employeeId = "employeeId_example"; // The UUID of the employee
    Boolean twoPercentShareholder = true; // Whether the employee owns at least 2% of the company.
    Boolean stateWcCovered = true; // Whether this job is eligible for workers' compensation coverage in the state of Washington (WA).
    String stateWcClassCode = "stateWcClassCode_example"; // The risk class code for workers' compensation in Washington state. Please visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Job result = client
              .jobsAndCompensations
              .createJob(title, hireDate, employeeId)
              .twoPercentShareholder(twoPercentShareholder)
              .stateWcCovered(stateWcCovered)
              .stateWcClassCode(stateWcClassCode)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getEmployeeUuid());
      System.out.println(result.getHireDate());
      System.out.println(result.getPrimary());
      System.out.println(result.getRate());
      System.out.println(result.getPaymentUnit());
      System.out.println(result.getCurrentCompensationUuid());
      System.out.println(result.getTwoPercentShareholder());
      System.out.println(result.getStateWcCovered());
      System.out.println(result.getStateWcClassCode());
      System.out.println(result.getCompensations());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#createJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Job> response = client
              .jobsAndCompensations
              .createJob(title, hireDate, employeeId)
              .twoPercentShareholder(twoPercentShareholder)
              .stateWcCovered(stateWcCovered)
              .stateWcClassCode(stateWcClassCode)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#createJob");
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
| **jobsAndCompensationsCreateJobRequest** | [**JobsAndCompensationsCreateJobRequest**](JobsAndCompensationsCreateJobRequest.md)| Create a job. | [optional] |

### Return type

[**Job**](Job.md)

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

<a name="deleteJobById"></a>
# **deleteJobById**
> deleteJobById(jobId).xGustoAPIVersion(xGustoAPIVersion).execute();

Delete an individual job

Deletes a specific job that an employee holds.  scope: &#x60;jobs:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsAndCompensationsApi;
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
    String jobId = "jobId_example"; // The UUID of the job
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .jobsAndCompensations
              .deleteJobById(jobId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#deleteJobById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .jobsAndCompensations
              .deleteJobById(jobId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#deleteJobById");
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
| **jobId** | **String**| The UUID of the job | |
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

<a name="getCompensationById"></a>
# **getCompensationById**
> Compensation getCompensationById(compensationId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a compensation

Compensations contain information on how much is paid out for a job. Jobs may have many compensations, but only one that is active. The current compensation is the one with the most recent &#x60;effective_date&#x60;.  scope: &#x60;jobs:read&#x60; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsAndCompensationsApi;
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
    String compensationId = "compensationId_example"; // The UUID of the compensation
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Compensation result = client
              .jobsAndCompensations
              .getCompensationById(compensationId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getJobUuid());
      System.out.println(result.getRate());
      System.out.println(result.getPaymentUnit());
      System.out.println(result.getFlsaStatus());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getAdjustForMinimumWage());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#getCompensationById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Compensation> response = client
              .jobsAndCompensations
              .getCompensationById(compensationId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#getCompensationById");
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
| **compensationId** | **String**| The UUID of the compensation | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**Compensation**](Compensation.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getEmployeeJobs"></a>
# **getEmployeeJobs**
> List&lt;Job&gt; getEmployeeJobs(employeeId).page(page).per(per).include(include).xGustoAPIVersion(xGustoAPIVersion).execute();

Get jobs for an employee

Get all of the jobs that an employee holds.  scope: &#x60;jobs:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsAndCompensationsApi;
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
    String include = "all_compensations"; // Available options: - all_compensations: Include all effective dated compensations for each job instead of only the current compensation
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<Job> result = client
              .jobsAndCompensations
              .getEmployeeJobs(employeeId)
              .page(page)
              .per(per)
              .include(include)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#getEmployeeJobs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Job>> response = client
              .jobsAndCompensations
              .getEmployeeJobs(employeeId)
              .page(page)
              .per(per)
              .include(include)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#getEmployeeJobs");
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
| **include** | **String**| Available options: - all_compensations: Include all effective dated compensations for each job instead of only the current compensation | [optional] [enum: all_compensations] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**List&lt;Job&gt;**](Job.md)

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

<a name="getJobCompensations"></a>
# **getJobCompensations**
> List&lt;Compensation&gt; getJobCompensations(jobId).page(page).per(per).include(include).xGustoAPIVersion(xGustoAPIVersion).execute();

Get compensations for a job

Compensations contain information on how much is paid out for a job. Jobs may have many compensations, but only one that is active. The current compensation is the one with the most recent &#x60;effective_date&#x60;. By default the API returns only the current compensation - see the &#x60;include&#x60; query parameter for retrieving all compensations.  Note: Currently the API does not support creating multiple compensations per job - creating a compensation with the same &#x60;job_uuid&#x60; as another will fail with a relevant error.  Use &#x60;flsa_status&#x60; to determine if an employee is eligible for overtime.  scope: &#x60;jobs:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsAndCompensationsApi;
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
    String jobId = "jobId_example"; // The UUID of the job
    Double page = 3.4D; // The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
    Double per = 3.4D; // Number of objects per page. For majority of endpoints will default to 25
    String include = "all_compensations"; // Available options: - all_compensations: Include all effective dated compensations for each job instead of only the current compensation
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<Compensation> result = client
              .jobsAndCompensations
              .getJobCompensations(jobId)
              .page(page)
              .per(per)
              .include(include)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#getJobCompensations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Compensation>> response = client
              .jobsAndCompensations
              .getJobCompensations(jobId)
              .page(page)
              .per(per)
              .include(include)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#getJobCompensations");
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
| **jobId** | **String**| The UUID of the job | |
| **page** | **Double**| The page that is requested. When unspecified, will load all objects unless endpoint forces pagination. | [optional] |
| **per** | **Double**| Number of objects per page. For majority of endpoints will default to 25 | [optional] |
| **include** | **String**| Available options: - all_compensations: Include all effective dated compensations for each job instead of only the current compensation | [optional] [enum: all_compensations] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**List&lt;Compensation&gt;**](Compensation.md)

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

<a name="getJobDetails"></a>
# **getJobDetails**
> Job getJobDetails(jobId).include(include).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a job

Get a job.  scope: &#x60;jobs:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsAndCompensationsApi;
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
    String jobId = "jobId_example"; // The UUID of the job
    String include = "all_compensations"; // Available options: - all_compensations: Include all effective dated compensations for the job instead of only the current compensation
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Job result = client
              .jobsAndCompensations
              .getJobDetails(jobId)
              .include(include)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getEmployeeUuid());
      System.out.println(result.getHireDate());
      System.out.println(result.getPrimary());
      System.out.println(result.getRate());
      System.out.println(result.getPaymentUnit());
      System.out.println(result.getCurrentCompensationUuid());
      System.out.println(result.getTwoPercentShareholder());
      System.out.println(result.getStateWcCovered());
      System.out.println(result.getStateWcClassCode());
      System.out.println(result.getCompensations());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#getJobDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Job> response = client
              .jobsAndCompensations
              .getJobDetails(jobId)
              .include(include)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#getJobDetails");
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
| **jobId** | **String**| The UUID of the job | |
| **include** | **String**| Available options: - all_compensations: Include all effective dated compensations for the job instead of only the current compensation | [optional] [enum: all_compensations] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**Job**](Job.md)

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

<a name="removeCompensation"></a>
# **removeCompensation**
> removeCompensation(compensationId).xGustoAPIVersion(xGustoAPIVersion).execute();

Delete a compensation

Compensations contain information on how much is paid out for a job. Jobs may have many compensations, but only one that is active. The current compensation is the one with the most recent &#x60;effective_date&#x60;. This endpoint deletes a compensation for a job that hasn&#39;t been processed on payroll.  scope: &#x60;jobs:write&#x60; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsAndCompensationsApi;
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
    String compensationId = "compensationId_example"; // The UUID of the compensation
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .jobsAndCompensations
              .removeCompensation(compensationId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#removeCompensation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .jobsAndCompensations
              .removeCompensation(compensationId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#removeCompensation");
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
| **compensationId** | **String**| The UUID of the compensation | |
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

<a name="updateCompensation"></a>
# **updateCompensation**
> Compensation updateCompensation(compensationId).xGustoAPIVersion(xGustoAPIVersion).jobsAndCompensationsUpdateCompensationRequest(jobsAndCompensationsUpdateCompensationRequest).execute();

Update a compensation

Compensations contain information on how much is paid out for a job. Jobs may have many compensations, but only one that is active. The current compensation is the one with the most recent &#x60;effective_date&#x60;.  scope: &#x60;jobs:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsAndCompensationsApi;
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
    String compensationId = "compensationId_example"; // The UUID of the compensation
    String rate = "rate_example"; // The dollar amount paid per payment unit.
    String paymentUnit = "Hour"; // The unit accompanying the compensation rate. If the employee is an owner, rate should be 'Paycheck'.
    FlsaStatusType flsaStatus = FlsaStatusType.fromValue("Exempt");
    Boolean adjustForMinimumWage = true; // Determines whether the compensation should be adjusted for minimum wage. Only applies to Nonexempt employees.
    List<JobsAndCompensationsCreateCompensationRequestMinimumWagesInner> minimumWages = Arrays.asList();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Compensation result = client
              .jobsAndCompensations
              .updateCompensation(version, compensationId)
              .rate(rate)
              .paymentUnit(paymentUnit)
              .flsaStatus(flsaStatus)
              .adjustForMinimumWage(adjustForMinimumWage)
              .minimumWages(minimumWages)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getJobUuid());
      System.out.println(result.getRate());
      System.out.println(result.getPaymentUnit());
      System.out.println(result.getFlsaStatus());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getAdjustForMinimumWage());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#updateCompensation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Compensation> response = client
              .jobsAndCompensations
              .updateCompensation(version, compensationId)
              .rate(rate)
              .paymentUnit(paymentUnit)
              .flsaStatus(flsaStatus)
              .adjustForMinimumWage(adjustForMinimumWage)
              .minimumWages(minimumWages)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#updateCompensation");
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
| **compensationId** | **String**| The UUID of the compensation | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **jobsAndCompensationsUpdateCompensationRequest** | [**JobsAndCompensationsUpdateCompensationRequest**](JobsAndCompensationsUpdateCompensationRequest.md)|  | [optional] |

### Return type

[**Compensation**](Compensation.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="updateJob"></a>
# **updateJob**
> Job updateJob(jobId).xGustoAPIVersion(xGustoAPIVersion).jobsAndCompensationsUpdateJobRequest(jobsAndCompensationsUpdateJobRequest).execute();

Update a job

Update a job.  scope: &#x60;jobs:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsAndCompensationsApi;
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
    String jobId = "jobId_example"; // The UUID of the job
    String title = "title_example"; // The job title
    String hireDate = "hireDate_example"; // The date when the employee was hired or rehired for the job.
    Boolean twoPercentShareholder = true; // Whether the employee owns at least 2% of the company.
    Boolean stateWcCovered = true; // Whether this job is eligible for workers' compensation coverage in the state of Washington (WA).
    String stateWcClassCode = "stateWcClassCode_example"; // The risk class code for workers' compensation in Washington state. Please visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Job result = client
              .jobsAndCompensations
              .updateJob(version, jobId)
              .title(title)
              .hireDate(hireDate)
              .twoPercentShareholder(twoPercentShareholder)
              .stateWcCovered(stateWcCovered)
              .stateWcClassCode(stateWcClassCode)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getEmployeeUuid());
      System.out.println(result.getHireDate());
      System.out.println(result.getPrimary());
      System.out.println(result.getRate());
      System.out.println(result.getPaymentUnit());
      System.out.println(result.getCurrentCompensationUuid());
      System.out.println(result.getTwoPercentShareholder());
      System.out.println(result.getStateWcCovered());
      System.out.println(result.getStateWcClassCode());
      System.out.println(result.getCompensations());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#updateJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Job> response = client
              .jobsAndCompensations
              .updateJob(version, jobId)
              .title(title)
              .hireDate(hireDate)
              .twoPercentShareholder(twoPercentShareholder)
              .stateWcCovered(stateWcCovered)
              .stateWcClassCode(stateWcClassCode)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsAndCompensationsApi#updateJob");
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
| **jobId** | **String**| The UUID of the job | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **jobsAndCompensationsUpdateJobRequest** | [**JobsAndCompensationsUpdateJobRequest**](JobsAndCompensationsUpdateJobRequest.md)| Update a job. | [optional] |

### Return type

[**Job**](Job.md)

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

