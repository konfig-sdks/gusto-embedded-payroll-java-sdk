# SignatoriesApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInvite**](SignatoriesApi.md#createInvite) | **POST** /v1/companies/{company_uuid}/signatories/invite | Invite a signatory |
| [**createSignatoryWithCompleteInformation**](SignatoriesApi.md#createSignatoryWithCompleteInformation) | **POST** /v1/companies/{company_uuid}/signatories | Create a signatory |
| [**deleteSignatory**](SignatoriesApi.md#deleteSignatory) | **DELETE** /v1/companies/{company_uuid}/signatories/{signatory_uuid} | Delete a signatory |
| [**getCompanySignatories**](SignatoriesApi.md#getCompanySignatories) | **GET** /v1/companies/{company_uuid}/signatories | Get all company signatories |
| [**update**](SignatoriesApi.md#update) | **PUT** /v1/companies/{company_uuid}/signatories/{signatory_uuid} | Update a signatory |


<a name="createInvite"></a>
# **createInvite**
> Signatory createInvite(companyUuid).xGustoAPIVersion(xGustoAPIVersion).signatoriesCreateInviteRequest(signatoriesCreateInviteRequest).execute();

Invite a signatory

Create a signatory with minimal information. This signatory can be invited to provide more information through the &#x60;PUT /v1/companies/{company_uuid}/signatories/{signatory_uuid}&#x60; endpoint. This will start the identity verification process and allow the signatory to be verified to sign documents.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignatoriesApi;
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
    String email = "email_example";
    String companyUuid = "companyUuid_example"; // The UUID of the company
    String title = "title_example";
    String firstName = "firstName_example";
    String lastName = "lastName_example";
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Signatory result = client
              .signatories
              .createInvite(email, companyUuid)
              .title(title)
              .firstName(firstName)
              .lastName(lastName)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getPhone());
      System.out.println(result.getEmail());
      System.out.println(result.getBirthday());
      System.out.println(result.getIsAdmin());
      System.out.println(result.getHasSsn());
      System.out.println(result.getIdentityVerificationStatus());
      System.out.println(result.getHomeAddress());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignatoriesApi#createInvite");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Signatory> response = client
              .signatories
              .createInvite(email, companyUuid)
              .title(title)
              .firstName(firstName)
              .lastName(lastName)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignatoriesApi#createInvite");
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
| **signatoriesCreateInviteRequest** | [**SignatoriesCreateInviteRequest**](SignatoriesCreateInviteRequest.md)|  | [optional] |

### Return type

[**Signatory**](Signatory.md)

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

<a name="createSignatoryWithCompleteInformation"></a>
# **createSignatoryWithCompleteInformation**
> Signatory createSignatoryWithCompleteInformation(companyUuid).xGustoAPIVersion(xGustoAPIVersion).signatoriesCreateSignatoryWithCompleteInformationRequest(signatoriesCreateSignatoryWithCompleteInformationRequest).execute();

Create a signatory

Create a company signatory with complete information. A signatory can legally sign forms once the identity verification process is successful.  scope: &#x60;signatories:manage&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignatoriesApi;
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
    String title = "title_example";
    String ssn = "ssn_example";
    String firstName = "firstName_example";
    String lastName = "lastName_example";
    String email = "email_example";
    String phone = "phone_example";
    String birthday = "birthday_example";
    SignatoriesCreateSignatoryWithCompleteInformationRequestHomeAddress homeAddress = new SignatoriesCreateSignatoryWithCompleteInformationRequestHomeAddress();
    String companyUuid = "companyUuid_example"; // The UUID of the company
    String middleInitial = "middleInitial_example";
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Signatory result = client
              .signatories
              .createSignatoryWithCompleteInformation(title, ssn, firstName, lastName, email, phone, birthday, homeAddress, companyUuid)
              .middleInitial(middleInitial)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getPhone());
      System.out.println(result.getEmail());
      System.out.println(result.getBirthday());
      System.out.println(result.getIsAdmin());
      System.out.println(result.getHasSsn());
      System.out.println(result.getIdentityVerificationStatus());
      System.out.println(result.getHomeAddress());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignatoriesApi#createSignatoryWithCompleteInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Signatory> response = client
              .signatories
              .createSignatoryWithCompleteInformation(title, ssn, firstName, lastName, email, phone, birthday, homeAddress, companyUuid)
              .middleInitial(middleInitial)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignatoriesApi#createSignatoryWithCompleteInformation");
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
| **signatoriesCreateSignatoryWithCompleteInformationRequest** | [**SignatoriesCreateSignatoryWithCompleteInformationRequest**](SignatoriesCreateSignatoryWithCompleteInformationRequest.md)|  | [optional] |

### Return type

[**Signatory**](Signatory.md)

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

<a name="deleteSignatory"></a>
# **deleteSignatory**
> deleteSignatory(companyUuid, signatoryUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Delete a signatory

Delete a company signatory.  scope: &#x60;signatories:manage&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignatoriesApi;
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
    String signatoryUuid = "signatoryUuid_example"; // The UUID of the signatory
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .signatories
              .deleteSignatory(companyUuid, signatoryUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SignatoriesApi#deleteSignatory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .signatories
              .deleteSignatory(companyUuid, signatoryUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SignatoriesApi#deleteSignatory");
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
| **signatoryUuid** | **String**| The UUID of the signatory | |
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

<a name="getCompanySignatories"></a>
# **getCompanySignatories**
> List&lt;Signatory&gt; getCompanySignatories(companyUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get all company signatories

Returns company signatories. Currently we only support a single signatory per company.  scope: &#x60;signatories:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignatoriesApi;
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
      List<Signatory> result = client
              .signatories
              .getCompanySignatories(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignatoriesApi#getCompanySignatories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Signatory>> response = client
              .signatories
              .getCompanySignatories(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignatoriesApi#getCompanySignatories");
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

[**List&lt;Signatory&gt;**](Signatory.md)

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

<a name="update"></a>
# **update**
> Signatory update(companyUuid, signatoryUuid).xGustoAPIVersion(xGustoAPIVersion).signatoriesUpdateRequest(signatoriesUpdateRequest).execute();

Update a signatory

Update a signatory that has been either invited or created. If the signatory has been created with minimal information through the &#x60;POST /v1/companies/{company_uuid}/signatories/invite&#x60; endpoint, then the first update must contain all attributes specified in the request body in order to start the identity verification process.  scope: &#x60;signatories:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SignatoriesApi;
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
    String signatoryUuid = "signatoryUuid_example"; // The UUID of the signatory
    String title = "title_example";
    String version = "version_example"; // The current version of the object. See the versioning guide for information on how to use this field.
    String firstName = "firstName_example";
    String middleInitial = "middleInitial_example";
    String lastName = "lastName_example";
    String phone = "phone_example";
    String birthday = "birthday_example";
    String ssn = "ssn_example";
    SignatoriesUpdateRequestHomeAddress homeAddress = new SignatoriesUpdateRequestHomeAddress();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Signatory result = client
              .signatories
              .update(companyUuid, signatoryUuid)
              .title(title)
              .version(version)
              .firstName(firstName)
              .middleInitial(middleInitial)
              .lastName(lastName)
              .phone(phone)
              .birthday(birthday)
              .ssn(ssn)
              .homeAddress(homeAddress)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getPhone());
      System.out.println(result.getEmail());
      System.out.println(result.getBirthday());
      System.out.println(result.getIsAdmin());
      System.out.println(result.getHasSsn());
      System.out.println(result.getIdentityVerificationStatus());
      System.out.println(result.getHomeAddress());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignatoriesApi#update");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Signatory> response = client
              .signatories
              .update(companyUuid, signatoryUuid)
              .title(title)
              .version(version)
              .firstName(firstName)
              .middleInitial(middleInitial)
              .lastName(lastName)
              .phone(phone)
              .birthday(birthday)
              .ssn(ssn)
              .homeAddress(homeAddress)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SignatoriesApi#update");
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
| **signatoryUuid** | **String**| The UUID of the signatory | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **signatoriesUpdateRequest** | [**SignatoriesUpdateRequest**](SignatoriesUpdateRequest.md)|  | [optional] |

### Return type

[**Signatory**](Signatory.md)

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

