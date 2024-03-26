# EmployeeBenefitsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBenefitRecord**](EmployeeBenefitsApi.md#createBenefitRecord) | **POST** /v1/employees/{employee_id}/employee_benefits | Create an employee benefit |
| [**createYtdBenefitAmountsFromDifferentCompany**](EmployeeBenefitsApi.md#createYtdBenefitAmountsFromDifferentCompany) | **POST** /v1/employees/{employee_id}/ytd_benefit_amounts_from_different_company | Create year-to-date benefit amounts from a different company |
| [**deleteById**](EmployeeBenefitsApi.md#deleteById) | **DELETE** /v1/employee_benefits/{employee_benefit_id} | Delete an employee benefit |
| [**getAllForEmployee**](EmployeeBenefitsApi.md#getAllForEmployee) | **GET** /v1/employees/{employee_id}/employee_benefits | Get all benefits for an employee |
| [**getEmployeeBenefitById**](EmployeeBenefitsApi.md#getEmployeeBenefitById) | **GET** /v1/employee_benefits/{employee_benefit_id} | Get an employee benefit |
| [**updateBenefitRecord**](EmployeeBenefitsApi.md#updateBenefitRecord) | **PUT** /v1/employee_benefits/{employee_benefit_id} | Update an employee benefit |


<a name="createBenefitRecord"></a>
# **createBenefitRecord**
> EmployeeBenefit createBenefitRecord(employeeId).xGustoAPIVersion(xGustoAPIVersion).employeeBenefitsCreateBenefitRecordRequest(employeeBenefitsCreateBenefitRecordRequest).execute();

Create an employee benefit

Employee benefits represent an employee enrolled in a particular company benefit. It includes information specific to that employee’s enrollment.  scope: &#x60;employee_benefits:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeBenefitsApi;
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
    String companyBenefitUuid = "companyBenefitUuid_example"; // The UUID of the company benefit.
    String employeeId = "employeeId_example"; // The UUID of the employee
    Boolean active = true; // Whether the employee benefit is active.
    String employeeDeduction = "0.00"; // The amount to be deducted, per pay period, from the employee's pay.
    Boolean deductAsPercentage = false; // Whether the employee deduction amount should be treated as a percentage to be deducted from each payroll.
    String employeeDeductionAnnualMaximum = "employeeDeductionAnnualMaximum_example"; // The maximum employee deduction amount per year. A null value signifies no limit.
    EmployeeBenefitsCreateBenefitRecordRequestContribution contribution = new EmployeeBenefitsCreateBenefitRecordRequestContribution();
    Boolean elective = false; // Whether the company contribution is elective (aka \\\"matching\\\"). For `tiered`, `elective_amount`, and `elective_percentage` contribution types this is ignored and assumed to be `true`.
    String companyContributionAnnualMaximum = "companyContributionAnnualMaximum_example"; // The maximum company contribution amount per year. A null value signifies no limit.
    String limitOption = "limitOption_example"; // Some benefits require additional information to determine their limit. For example, for an HSA benefit, the limit option should be either \\\"Family\\\" or \\\"Individual\\\". For a Dependent Care FSA benefit, the limit option should be either \\\"Joint Filing or Single\\\" or \\\"Married and Filing Separately\\\".
    Boolean catchUp = false; // Whether the employee should use a benefit’s \\\"catch up\\\" rate. Only Roth 401k and 401k benefits use this value for employees over 50.
    String coverageAmount = "coverageAmount_example"; // The amount that the employee is insured for. Note: company contribution cannot be present if coverage amount is set.
    String coverageSalaryMultiplier = "0.00"; // The coverage amount as a multiple of the employee’s salary. Only applicable for Group Term Life benefits. Note: cannot be set if coverage amount is also set.
    String deductionReducesTaxableIncome = "unset"; // Whether the employee deduction reduces taxable income or not. Only valid for Group Term Life benefits. Note: when the value is not \\\"unset\\\", coverage amount and coverage salary multiplier are ignored.
    String companyContribution = "0.00"; // The amount to be paid, per pay period, by the company.
    Boolean contributeAsPercentage = false; // Whether the company contribution amount should be treated as a percentage to be deducted from each payroll.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      EmployeeBenefit result = client
              .employeeBenefits
              .createBenefitRecord(companyBenefitUuid, employeeId)
              .active(active)
              .employeeDeduction(employeeDeduction)
              .deductAsPercentage(deductAsPercentage)
              .employeeDeductionAnnualMaximum(employeeDeductionAnnualMaximum)
              .contribution(contribution)
              .elective(elective)
              .companyContributionAnnualMaximum(companyContributionAnnualMaximum)
              .limitOption(limitOption)
              .catchUp(catchUp)
              .coverageAmount(coverageAmount)
              .coverageSalaryMultiplier(coverageSalaryMultiplier)
              .deductionReducesTaxableIncome(deductionReducesTaxableIncome)
              .companyContribution(companyContribution)
              .contributeAsPercentage(contributeAsPercentage)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getEmployeeUuid());
      System.out.println(result.getCompanyBenefitUuid());
      System.out.println(result.getActive());
      System.out.println(result.getUuid());
      System.out.println(result.getEmployeeDeduction());
      System.out.println(result.getDeductAsPercentage());
      System.out.println(result.getEmployeeDeductionAnnualMaximum());
      System.out.println(result.getContribution());
      System.out.println(result.getElective());
      System.out.println(result.getCompanyContributionAnnualMaximum());
      System.out.println(result.getLimitOption());
      System.out.println(result.getCatchUp());
      System.out.println(result.getRetirementLoanIdentifier());
      System.out.println(result.getCoverageAmount());
      System.out.println(result.getDeductionReducesTaxableIncome());
      System.out.println(result.getCoverageSalaryMultiplier());
      System.out.println(result.getCompanyContribution());
      System.out.println(result.getContributeAsPercentage());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeBenefitsApi#createBenefitRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeBenefit> response = client
              .employeeBenefits
              .createBenefitRecord(companyBenefitUuid, employeeId)
              .active(active)
              .employeeDeduction(employeeDeduction)
              .deductAsPercentage(deductAsPercentage)
              .employeeDeductionAnnualMaximum(employeeDeductionAnnualMaximum)
              .contribution(contribution)
              .elective(elective)
              .companyContributionAnnualMaximum(companyContributionAnnualMaximum)
              .limitOption(limitOption)
              .catchUp(catchUp)
              .coverageAmount(coverageAmount)
              .coverageSalaryMultiplier(coverageSalaryMultiplier)
              .deductionReducesTaxableIncome(deductionReducesTaxableIncome)
              .companyContribution(companyContribution)
              .contributeAsPercentage(contributeAsPercentage)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeBenefitsApi#createBenefitRecord");
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
| **employeeBenefitsCreateBenefitRecordRequest** | [**EmployeeBenefitsCreateBenefitRecordRequest**](EmployeeBenefitsCreateBenefitRecordRequest.md)|  | [optional] |

### Return type

[**EmployeeBenefit**](EmployeeBenefit.md)

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

<a name="createYtdBenefitAmountsFromDifferentCompany"></a>
# **createYtdBenefitAmountsFromDifferentCompany**
> createYtdBenefitAmountsFromDifferentCompany(employeeId).xGustoAPIVersion(xGustoAPIVersion).employeeBenefitsCreateYtdBenefitAmountsFromDifferentCompanyRequest(employeeBenefitsCreateYtdBenefitAmountsFromDifferentCompanyRequest).execute();

Create year-to-date benefit amounts from a different company

Year-to-date benefit amounts from a different company represents the amount of money added to an employee&#39;s plan during a current year, made outside of the current contribution when they were employed at a different company.  This endpoint only supports passing outside contributions for 401(k) benefits.  scope: &#x60;employee_benefits:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeBenefitsApi;
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
    Double taxYear = 3.4D; // The tax year for which this amount applies.
    String ytdEmployeeDeductionAmount = "0.00"; // The year-to-date employee deduction made outside the current company.
    String ytdCompanyContributionAmount = "0.00"; // The year-to-date company contribution made outside the current company.
    String employeeId = "employeeId_example"; // The UUID of the employee
    Double benefitType = 3.4D; // The benefit type supported by Gusto.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .employeeBenefits
              .createYtdBenefitAmountsFromDifferentCompany(taxYear, ytdEmployeeDeductionAmount, ytdCompanyContributionAmount, employeeId)
              .benefitType(benefitType)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeBenefitsApi#createYtdBenefitAmountsFromDifferentCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employeeBenefits
              .createYtdBenefitAmountsFromDifferentCompany(taxYear, ytdEmployeeDeductionAmount, ytdCompanyContributionAmount, employeeId)
              .benefitType(benefitType)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeBenefitsApi#createYtdBenefitAmountsFromDifferentCompany");
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
| **employeeBenefitsCreateYtdBenefitAmountsFromDifferentCompanyRequest** | [**EmployeeBenefitsCreateYtdBenefitAmountsFromDifferentCompanyRequest**](EmployeeBenefitsCreateYtdBenefitAmountsFromDifferentCompanyRequest.md)|  | [optional] |

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
| **204** | No Content |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="deleteById"></a>
# **deleteById**
> deleteById(employeeBenefitId).xGustoAPIVersion(xGustoAPIVersion).execute();

Delete an employee benefit

Employee benefits represent an employee enrolled in a particular company benefit. It includes information specific to that employee’s enrollment.  scope: &#x60;employee_benefits:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeBenefitsApi;
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
    String employeeBenefitId = "employeeBenefitId_example"; // The UUID of the employee benefit.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .employeeBenefits
              .deleteById(employeeBenefitId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeBenefitsApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employeeBenefits
              .deleteById(employeeBenefitId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeBenefitsApi#deleteById");
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
| **employeeBenefitId** | **String**| The UUID of the employee benefit. | |
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

<a name="getAllForEmployee"></a>
# **getAllForEmployee**
> List&lt;EmployeeBenefit&gt; getAllForEmployee(employeeId).page(page).per(per).xGustoAPIVersion(xGustoAPIVersion).execute();

Get all benefits for an employee

Employee benefits represent an employee enrolled in a particular company benefit. It includes information specific to that employee’s enrollment.  Returns an array of all employee benefits for this employee  Benefits containing PHI are only visible to applications with the &#x60;employee_benefits:read:phi&#x60; scope.  scope: &#x60;employee_benefits:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeBenefitsApi;
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
      List<EmployeeBenefit> result = client
              .employeeBenefits
              .getAllForEmployee(employeeId)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeBenefitsApi#getAllForEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeBenefit>> response = client
              .employeeBenefits
              .getAllForEmployee(employeeId)
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
      System.err.println("Exception when calling EmployeeBenefitsApi#getAllForEmployee");
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

[**List&lt;EmployeeBenefit&gt;**](EmployeeBenefit.md)

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

<a name="getEmployeeBenefitById"></a>
# **getEmployeeBenefitById**
> EmployeeBenefit getEmployeeBenefitById(employeeBenefitId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get an employee benefit

Employee benefits represent an employee enrolled in a particular company benefit. It includes information specific to that employee’s enrollment.  Benefits containing PHI are only visible to applications with the &#x60;employee_benefits:read:phi&#x60; scope.  scope: &#x60;employee_benefits:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeBenefitsApi;
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
    String employeeBenefitId = "employeeBenefitId_example"; // The UUID of the employee benefit.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      EmployeeBenefit result = client
              .employeeBenefits
              .getEmployeeBenefitById(employeeBenefitId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getEmployeeUuid());
      System.out.println(result.getCompanyBenefitUuid());
      System.out.println(result.getActive());
      System.out.println(result.getUuid());
      System.out.println(result.getEmployeeDeduction());
      System.out.println(result.getDeductAsPercentage());
      System.out.println(result.getEmployeeDeductionAnnualMaximum());
      System.out.println(result.getContribution());
      System.out.println(result.getElective());
      System.out.println(result.getCompanyContributionAnnualMaximum());
      System.out.println(result.getLimitOption());
      System.out.println(result.getCatchUp());
      System.out.println(result.getRetirementLoanIdentifier());
      System.out.println(result.getCoverageAmount());
      System.out.println(result.getDeductionReducesTaxableIncome());
      System.out.println(result.getCoverageSalaryMultiplier());
      System.out.println(result.getCompanyContribution());
      System.out.println(result.getContributeAsPercentage());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeBenefitsApi#getEmployeeBenefitById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeBenefit> response = client
              .employeeBenefits
              .getEmployeeBenefitById(employeeBenefitId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeBenefitsApi#getEmployeeBenefitById");
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
| **employeeBenefitId** | **String**| The UUID of the employee benefit. | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**EmployeeBenefit**](EmployeeBenefit.md)

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

<a name="updateBenefitRecord"></a>
# **updateBenefitRecord**
> EmployeeBenefit updateBenefitRecord(employeeBenefitId).xGustoAPIVersion(xGustoAPIVersion).employeeBenefitsUpdateBenefitRecordRequest(employeeBenefitsUpdateBenefitRecordRequest).execute();

Update an employee benefit

Employee benefits represent an employee enrolled in a particular company benefit. It includes information specific to that employee’s enrollment.  scope: &#x60;employee_benefits:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeBenefitsApi;
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
    String employeeBenefitId = "employeeBenefitId_example"; // The UUID of the employee benefit.
    Boolean active = true; // Whether the employee benefit is active.
    String employeeDeduction = "0.00"; // The amount to be deducted, per pay period, from the employee's pay.
    Boolean deductAsPercentage = true; // Whether the employee deduction amount should be treated as a percentage to be deducted from each payroll.
    String employeeDeductionAnnualMaximum = "employeeDeductionAnnualMaximum_example"; // The maximum employee deduction amount per year. A null value signifies no limit.
    EmployeeBenefitsUpdateBenefitRecordRequestContribution contribution = new EmployeeBenefitsUpdateBenefitRecordRequestContribution();
    Boolean elective = false; // Whether the company contribution is elective (aka \\\"matching\\\"). For `tiered`, `elective_amount`, and `elective_percentage` contribution types this is ignored and assumed to be `true`.
    String companyContributionAnnualMaximum = "companyContributionAnnualMaximum_example"; // The maximum company contribution amount per year. A null value signifies no limit.
    String limitOption = "limitOption_example"; // Some benefits require additional information to determine their limit. For example, for an HSA benefit, the limit option should be either \\\"Family\\\" or \\\"Individual\\\". For a Dependent Care FSA benefit, the limit option should be either \\\"Joint Filing or Single\\\" or \\\"Married and Filing Separately\\\".
    Boolean catchUp = false; // Whether the employee should use a benefit’s \\\"catch up\\\" rate. Only Roth 401k and 401k benefits use this value for employees over 50.
    String coverageAmount = "coverageAmount_example"; // The amount that the employee is insured for. Note: company contribution cannot be present if coverage amount is set.
    String deductionReducesTaxableIncome = "unset"; // Whether the employee deduction reduces taxable income or not. Only valid for Group Term Life benefits. Note: when the value is not \\\"unset\\\", coverage amount and coverage salary multiplier are ignored.
    String coverageSalaryMultiplier = "0.00"; // The coverage amount as a multiple of the employee’s salary. Only applicable for Group Term Life benefits. Note: cannot be set if coverage amount is also set.
    String companyContribution = "0.00"; // The amount to be paid, per pay period, by the company.
    Boolean contributeAsPercentage = false; // Whether the company contribution amount should be treated as a percentage to be deducted from each payroll.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      EmployeeBenefit result = client
              .employeeBenefits
              .updateBenefitRecord(version, employeeBenefitId)
              .active(active)
              .employeeDeduction(employeeDeduction)
              .deductAsPercentage(deductAsPercentage)
              .employeeDeductionAnnualMaximum(employeeDeductionAnnualMaximum)
              .contribution(contribution)
              .elective(elective)
              .companyContributionAnnualMaximum(companyContributionAnnualMaximum)
              .limitOption(limitOption)
              .catchUp(catchUp)
              .coverageAmount(coverageAmount)
              .deductionReducesTaxableIncome(deductionReducesTaxableIncome)
              .coverageSalaryMultiplier(coverageSalaryMultiplier)
              .companyContribution(companyContribution)
              .contributeAsPercentage(contributeAsPercentage)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getEmployeeUuid());
      System.out.println(result.getCompanyBenefitUuid());
      System.out.println(result.getActive());
      System.out.println(result.getUuid());
      System.out.println(result.getEmployeeDeduction());
      System.out.println(result.getDeductAsPercentage());
      System.out.println(result.getEmployeeDeductionAnnualMaximum());
      System.out.println(result.getContribution());
      System.out.println(result.getElective());
      System.out.println(result.getCompanyContributionAnnualMaximum());
      System.out.println(result.getLimitOption());
      System.out.println(result.getCatchUp());
      System.out.println(result.getRetirementLoanIdentifier());
      System.out.println(result.getCoverageAmount());
      System.out.println(result.getDeductionReducesTaxableIncome());
      System.out.println(result.getCoverageSalaryMultiplier());
      System.out.println(result.getCompanyContribution());
      System.out.println(result.getContributeAsPercentage());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeBenefitsApi#updateBenefitRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeBenefit> response = client
              .employeeBenefits
              .updateBenefitRecord(version, employeeBenefitId)
              .active(active)
              .employeeDeduction(employeeDeduction)
              .deductAsPercentage(deductAsPercentage)
              .employeeDeductionAnnualMaximum(employeeDeductionAnnualMaximum)
              .contribution(contribution)
              .elective(elective)
              .companyContributionAnnualMaximum(companyContributionAnnualMaximum)
              .limitOption(limitOption)
              .catchUp(catchUp)
              .coverageAmount(coverageAmount)
              .deductionReducesTaxableIncome(deductionReducesTaxableIncome)
              .coverageSalaryMultiplier(coverageSalaryMultiplier)
              .companyContribution(companyContribution)
              .contributeAsPercentage(contributeAsPercentage)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeBenefitsApi#updateBenefitRecord");
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
| **employeeBenefitId** | **String**| The UUID of the employee benefit. | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **employeeBenefitsUpdateBenefitRecordRequest** | [**EmployeeBenefitsUpdateBenefitRecordRequest**](EmployeeBenefitsUpdateBenefitRecordRequest.md)|  | [optional] |

### Return type

[**EmployeeBenefit**](EmployeeBenefit.md)

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

