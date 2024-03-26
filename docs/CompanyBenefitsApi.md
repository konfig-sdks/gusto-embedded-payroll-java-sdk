# CompanyBenefitsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBenefit**](CompanyBenefitsApi.md#createBenefit) | **POST** /v1/companies/{company_id}/company_benefits | Create a company benefit |
| [**deleteBenefit**](CompanyBenefitsApi.md#deleteBenefit) | **DELETE** /v1/company_benefits/{company_benefit_id} | Delete a company benefit |
| [**getBenefitById**](CompanyBenefitsApi.md#getBenefitById) | **GET** /v1/company_benefits/{company_benefit_id} | Get a company benefit |
| [**getBenefitFieldsRequirementsById**](CompanyBenefitsApi.md#getBenefitFieldsRequirementsById) | **GET** /v1/benefits/{benefit_id}/requirements | Get benefit fields requirements by ID |
| [**getBenefitSummaryById**](CompanyBenefitsApi.md#getBenefitSummaryById) | **GET** /v1/company_benefits/{company_benefit_id}/summary | Get company benefit summary by company benefit id. |
| [**getBenefitsForCompany**](CompanyBenefitsApi.md#getBenefitsForCompany) | **GET** /v1/companies/{company_id}/company_benefits | Get benefits for a company |
| [**getSupportedBenefitById**](CompanyBenefitsApi.md#getSupportedBenefitById) | **GET** /v1/benefits/{benefit_id} | Get a supported benefit by ID |
| [**listSupportedBenefits**](CompanyBenefitsApi.md#listSupportedBenefits) | **GET** /v1/benefits | Get all benefits supported by Gusto |
| [**updateBenefit**](CompanyBenefitsApi.md#updateBenefit) | **PUT** /v1/company_benefits/{company_benefit_id} | Update a company benefit |


<a name="createBenefit"></a>
# **createBenefit**
> CompanyBenefit createBenefit(companyId).xGustoAPIVersion(xGustoAPIVersion).companyBenefitsCreateBenefitRequest(companyBenefitsCreateBenefitRequest).execute();

Create a company benefit

Company benefits represent the benefits that a company is offering to employees. This ties together a particular supported benefit with the company-specific information for the offering of that benefit.  Note that company benefits can be deactivated only when no employees are enrolled.  scope: &#x60;company_benefits:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyBenefitsApi;
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
    String description = "description_example"; // The description of the company benefit.For example, a company may offer multiple benefits with an ID of 1 (for Medical Insurance). The description would show something more specific like “Kaiser Permanente” or “Blue Cross/ Blue Shield”.
    String companyId = "companyId_example"; // The UUID of the company
    Double benefitType = 3.4D; // The ID of the benefit to which the company benefit belongs.
    Boolean active = true; // Whether this benefit is active for employee participation.
    Boolean responsibleForEmployerTaxes = true; // Whether the employer is subject to pay employer taxes when an employee is on leave. Only applicable to third party sick pay benefits.
    Boolean responsibleForEmployeeW2 = true; // Whether the employer is subject to file W-2 forms for an employee on leave. Only applicable to third party sick pay benefits.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      CompanyBenefit result = client
              .companyBenefits
              .createBenefit(description, companyId)
              .benefitType(benefitType)
              .active(active)
              .responsibleForEmployerTaxes(responsibleForEmployerTaxes)
              .responsibleForEmployeeW2(responsibleForEmployeeW2)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getBenefitType());
      System.out.println(result.getActive());
      System.out.println(result.getDeletable());
      System.out.println(result.getSupportsPercentageAmounts());
      System.out.println(result.getResponsibleForEmployerTaxes());
      System.out.println(result.getResponsibleForEmployeeW2());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#createBenefit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyBenefit> response = client
              .companyBenefits
              .createBenefit(description, companyId)
              .benefitType(benefitType)
              .active(active)
              .responsibleForEmployerTaxes(responsibleForEmployerTaxes)
              .responsibleForEmployeeW2(responsibleForEmployeeW2)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#createBenefit");
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
| **companyBenefitsCreateBenefitRequest** | [**CompanyBenefitsCreateBenefitRequest**](CompanyBenefitsCreateBenefitRequest.md)|  | [optional] |

### Return type

[**CompanyBenefit**](CompanyBenefit.md)

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

<a name="deleteBenefit"></a>
# **deleteBenefit**
> deleteBenefit(companyBenefitId).xGustoAPIVersion(xGustoAPIVersion).execute();

Delete a company benefit

The following must be true in order to delete a company benefit   - There are no employee benefits associated with the company benefit   - There are no payroll items associated with the company benefit   - The benefit is not managed by a Partner or by Gusto (type must be &#39;External&#39;)  scope: &#x60;company_benefits:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyBenefitsApi;
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
    String companyBenefitId = "companyBenefitId_example"; // The UUID of the company benefit
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .companyBenefits
              .deleteBenefit(companyBenefitId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#deleteBenefit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .companyBenefits
              .deleteBenefit(companyBenefitId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#deleteBenefit");
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
| **companyBenefitId** | **String**| The UUID of the company benefit | |
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
| **204** | No content |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getBenefitById"></a>
# **getBenefitById**
> CompanyBenefitWithEmployeeBenefits getBenefitById(companyBenefitId).withEmployeeBenefits(withEmployeeBenefits).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a company benefit

Company benefits represent the benefits that a company is offering to employees. This ties together a particular supported benefit with the company-specific information for the offering of that benefit.  Note that company benefits can be deactivated only when no employees are enrolled.  When with_employee_benefits parameter with true value is passed, employee_benefits:read scope is required to return employee_benefits.  scope: &#x60;company_benefits:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyBenefitsApi;
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
    String companyBenefitId = "companyBenefitId_example"; // The UUID of the company benefit
    Boolean withEmployeeBenefits = true; // Whether to return employee benefits associated with the benefit
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      CompanyBenefitWithEmployeeBenefits result = client
              .companyBenefits
              .getBenefitById(companyBenefitId)
              .withEmployeeBenefits(withEmployeeBenefits)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getBenefitType());
      System.out.println(result.getActive());
      System.out.println(result.getDeletable());
      System.out.println(result.getSupportsPercentageAmounts());
      System.out.println(result.getResponsibleForEmployerTaxes());
      System.out.println(result.getResponsibleForEmployeeW2());
      System.out.println(result.getEmployeeBenefits());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#getBenefitById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyBenefitWithEmployeeBenefits> response = client
              .companyBenefits
              .getBenefitById(companyBenefitId)
              .withEmployeeBenefits(withEmployeeBenefits)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#getBenefitById");
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
| **companyBenefitId** | **String**| The UUID of the company benefit | |
| **withEmployeeBenefits** | **Boolean**| Whether to return employee benefits associated with the benefit | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**CompanyBenefitWithEmployeeBenefits**](CompanyBenefitWithEmployeeBenefits.md)

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

<a name="getBenefitFieldsRequirementsById"></a>
# **getBenefitFieldsRequirementsById**
> BenefitTypeRequirements getBenefitFieldsRequirementsById(benefitId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get benefit fields requirements by ID

Returns field requirements for the requested benefit type.  scope: &#x60;benefits:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyBenefitsApi;
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
    String benefitId = "benefitId_example"; // The benefit type in Gusto.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      BenefitTypeRequirements result = client
              .companyBenefits
              .getBenefitFieldsRequirementsById(benefitId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmployeeDeduction());
      System.out.println(result.getContribution());
      System.out.println(result.getDeductAsPercentage());
      System.out.println(result.getCatchUp());
      System.out.println(result.getLimitOption());
      System.out.println(result.getCompanyContributionAnnualMaximum());
      System.out.println(result.getCoverageSalaryMultiplier());
      System.out.println(result.getCoverageAmount());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#getBenefitFieldsRequirementsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BenefitTypeRequirements> response = client
              .companyBenefits
              .getBenefitFieldsRequirementsById(benefitId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#getBenefitFieldsRequirementsById");
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
| **benefitId** | **String**| The benefit type in Gusto. | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**BenefitTypeRequirements**](BenefitTypeRequirements.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Benefit type requirements response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getBenefitSummaryById"></a>
# **getBenefitSummaryById**
> BenefitSummary getBenefitSummaryById(companyBenefitId).startDate(startDate).endDate(endDate).detailed(detailed).xGustoAPIVersion(xGustoAPIVersion).execute();

Get company benefit summary by company benefit id.

Returns summary benefit data for the requested company benefit id.  Benefits containing PHI are only visible to applications with the &#x60;company_benefits:read:phi&#x60; scope.  scope: &#x60;company_benefits:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyBenefitsApi;
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
    String companyBenefitId = "companyBenefitId_example"; // The UUID of the company benefit
    String startDate = "2022-01-01"; // The start date for which to retrieve company benefit summary
    String endDate = "2022-12-31"; // The end date for which to retrieve company benefit summary
    Boolean detailed = true; // Display employee payroll item summary
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      BenefitSummary result = client
              .companyBenefits
              .getBenefitSummaryById(companyBenefitId)
              .startDate(startDate)
              .endDate(endDate)
              .detailed(detailed)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getCompanyBenefitDeduction());
      System.out.println(result.getCompanyBenefitContribution());
      System.out.println(result.getEmployees());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#getBenefitSummaryById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BenefitSummary> response = client
              .companyBenefits
              .getBenefitSummaryById(companyBenefitId)
              .startDate(startDate)
              .endDate(endDate)
              .detailed(detailed)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#getBenefitSummaryById");
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
| **companyBenefitId** | **String**| The UUID of the company benefit | |
| **startDate** | **String**| The start date for which to retrieve company benefit summary | [optional] |
| **endDate** | **String**| The end date for which to retrieve company benefit summary | [optional] |
| **detailed** | **Boolean**| Display employee payroll item summary | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**BenefitSummary**](BenefitSummary.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Benefit summary response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getBenefitsForCompany"></a>
# **getBenefitsForCompany**
> List&lt;CompanyBenefit&gt; getBenefitsForCompany(companyId).enrollmentCount(enrollmentCount).xGustoAPIVersion(xGustoAPIVersion).execute();

Get benefits for a company

Company benefits represent the benefits that a company is offering to employees. This ties together a particular supported benefit with the company-specific information for the offering of that benefit.  Note that company benefits can be deactivated only when no employees are enrolled.  Benefits containing PHI are only visible to applications with the &#x60;company_benefits:read:phi&#x60; scope.  scope: &#x60;company_benefits:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyBenefitsApi;
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
    Boolean enrollmentCount = true; // Whether to return employee enrollment count
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<CompanyBenefit> result = client
              .companyBenefits
              .getBenefitsForCompany(companyId)
              .enrollmentCount(enrollmentCount)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#getBenefitsForCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CompanyBenefit>> response = client
              .companyBenefits
              .getBenefitsForCompany(companyId)
              .enrollmentCount(enrollmentCount)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#getBenefitsForCompany");
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
| **enrollmentCount** | **Boolean**| Whether to return employee enrollment count | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**List&lt;CompanyBenefit&gt;**](CompanyBenefit.md)

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

<a name="getSupportedBenefitById"></a>
# **getSupportedBenefitById**
> SupportedBenefit getSupportedBenefitById(benefitId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a supported benefit by ID

Returns a benefit supported by Gusto.  The benefit object in Gusto contains high level information about a particular benefit type and its tax considerations. When companies choose to offer a benefit, they are creating a Company Benefit object associated with a particular benefit.  scope: &#x60;benefits:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyBenefitsApi;
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
    String benefitId = "benefitId_example"; // The benefit type in Gusto.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      SupportedBenefit result = client
              .companyBenefits
              .getSupportedBenefitById(benefitId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getBenefitType());
      System.out.println(result.getName());
      System.out.println(result.getPretax());
      System.out.println(result.getPosttax());
      System.out.println(result.getImputed());
      System.out.println(result.getHealthcare());
      System.out.println(result.getRetirement());
      System.out.println(result.getYearlyLimit());
      System.out.println(result.getCategory());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#getSupportedBenefitById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SupportedBenefit> response = client
              .companyBenefits
              .getSupportedBenefitById(benefitId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#getSupportedBenefitById");
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
| **benefitId** | **String**| The benefit type in Gusto. | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**SupportedBenefit**](SupportedBenefit.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Supported benefit response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="listSupportedBenefits"></a>
# **listSupportedBenefits**
> List&lt;SupportedBenefit&gt; listSupportedBenefits().xGustoAPIVersion(xGustoAPIVersion).execute();

Get all benefits supported by Gusto

Returns all benefits supported by Gusto.  The benefit object in Gusto contains high level information about a particular benefit type and its tax considerations. When companies choose to offer a benefit, they are creating a Company Benefit object associated with a particular benefit.  scope: &#x60;benefits:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyBenefitsApi;
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
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<SupportedBenefit> result = client
              .companyBenefits
              .listSupportedBenefits()
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#listSupportedBenefits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<SupportedBenefit>> response = client
              .companyBenefits
              .listSupportedBenefits()
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#listSupportedBenefits");
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
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**List&lt;SupportedBenefit&gt;**](SupportedBenefit.md)

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

<a name="updateBenefit"></a>
# **updateBenefit**
> CompanyBenefit updateBenefit(companyBenefitId).xGustoAPIVersion(xGustoAPIVersion).companyBenefitsUpdateBenefitRequest(companyBenefitsUpdateBenefitRequest).execute();

Update a company benefit

Company benefits represent the benefits that a company is offering to employees. This ties together a particular supported benefit with the company-specific information for the offering of that benefit.  Note that company benefits can be deactivated only when no employees are enrolled.  scope: &#x60;company_benefits:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyBenefitsApi;
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
    String companyBenefitId = "companyBenefitId_example"; // The UUID of the company benefit
    String description = "description_example"; // The description of the company benefit.For example, a company may offer multiple benefits with an ID of 1 (for Medical Insurance). The description would show something more specific like “Kaiser Permanente” or “Blue Cross/ Blue Shield”.
    Boolean active = true; // Whether this benefit is active for employee participation. Company benefits may only be deactivated if no employees are actively participating.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      CompanyBenefit result = client
              .companyBenefits
              .updateBenefit(version, companyBenefitId)
              .description(description)
              .active(active)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getBenefitType());
      System.out.println(result.getActive());
      System.out.println(result.getDeletable());
      System.out.println(result.getSupportsPercentageAmounts());
      System.out.println(result.getResponsibleForEmployerTaxes());
      System.out.println(result.getResponsibleForEmployeeW2());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#updateBenefit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyBenefit> response = client
              .companyBenefits
              .updateBenefit(version, companyBenefitId)
              .description(description)
              .active(active)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyBenefitsApi#updateBenefit");
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
| **companyBenefitId** | **String**| The UUID of the company benefit | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **companyBenefitsUpdateBenefitRequest** | [**CompanyBenefitsUpdateBenefitRequest**](CompanyBenefitsUpdateBenefitRequest.md)|  | [optional] |

### Return type

[**CompanyBenefit**](CompanyBenefit.md)

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

