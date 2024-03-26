# EmployeeAddressesApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createHomeAddress**](EmployeeAddressesApi.md#createHomeAddress) | **POST** /v1/employees/{employee_id}/home_addresses | Create an employee&#39;s home address |
| [**createWorkAddress**](EmployeeAddressesApi.md#createWorkAddress) | **POST** /v1/employees/{employee_id}/work_addresses | Create an employee work address |
| [**deleteHome**](EmployeeAddressesApi.md#deleteHome) | **DELETE** /v1/home_addresses/{home_address_uuid} | Delete an employee&#39;s home address |
| [**deleteWorkAddress**](EmployeeAddressesApi.md#deleteWorkAddress) | **DELETE** /v1/work_addresses/{work_address_uuid} | Delete an employee&#39;s work address |
| [**getHomeAddress**](EmployeeAddressesApi.md#getHomeAddress) | **GET** /v1/home_addresses/{home_address_uuid} | Get an employee&#39;s home address |
| [**getHomeAddresses**](EmployeeAddressesApi.md#getHomeAddresses) | **GET** /v1/employees/{employee_id}/home_addresses | Get an employee&#39;s home addresses |
| [**getWorkAddress**](EmployeeAddressesApi.md#getWorkAddress) | **GET** /v1/work_addresses/{work_address_uuid} | Get an employee work address |
| [**listWorkAddresses**](EmployeeAddressesApi.md#listWorkAddresses) | **GET** /v1/employees/{employee_id}/work_addresses | Get an employee&#39;s work addresses |
| [**updateHomeAddress**](EmployeeAddressesApi.md#updateHomeAddress) | **PUT** /v1/home_addresses/{home_address_uuid} | Update an employee&#39;s home address |
| [**updateWorkAddress**](EmployeeAddressesApi.md#updateWorkAddress) | **PUT** /v1/work_addresses/{work_address_uuid} | Update an employee work address |


<a name="createHomeAddress"></a>
# **createHomeAddress**
> EmployeeAddress createHomeAddress(employeeId).xGustoAPIVersion(xGustoAPIVersion).employeeAddressesCreateHomeAddressRequest(employeeAddressesCreateHomeAddressRequest).execute();

Create an employee&#39;s home address

The home address of an employee is used to determine certain tax information about them. Addresses are geocoded on create and update to ensure validity.  Supports home address effective dating and courtesy withholding.  scope: &#x60;employees:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeAddressesApi;
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
    String street1 = "street1_example";
    String street2 = "street2_example";
    String city = "city_example";
    String state = "state_example";
    String zip = "zip_example";
    LocalDate effectiveDate = LocalDate.now();
    Boolean courtesyWithholding = true;
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      EmployeeAddress result = client
              .employeeAddresses
              .createHomeAddress(employeeId)
              .street1(street1)
              .street2(street2)
              .city(city)
              .state(state)
              .zip(zip)
              .effectiveDate(effectiveDate)
              .courtesyWithholding(courtesyWithholding)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getStreet1());
      System.out.println(result.getStreet2());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZip());
      System.out.println(result.getCountry());
      System.out.println(result.getActive());
      System.out.println(result.getUuid());
      System.out.println(result.getEmployeeUuid());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getCourtesyWithholding());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#createHomeAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeAddress> response = client
              .employeeAddresses
              .createHomeAddress(employeeId)
              .street1(street1)
              .street2(street2)
              .city(city)
              .state(state)
              .zip(zip)
              .effectiveDate(effectiveDate)
              .courtesyWithholding(courtesyWithholding)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#createHomeAddress");
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
| **employeeAddressesCreateHomeAddressRequest** | [**EmployeeAddressesCreateHomeAddressRequest**](EmployeeAddressesCreateHomeAddressRequest.md)|  | [optional] |

### Return type

[**EmployeeAddress**](EmployeeAddress.md)

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

<a name="createWorkAddress"></a>
# **createWorkAddress**
> EmployeeWorkAddress createWorkAddress(employeeId).xGustoAPIVersion(xGustoAPIVersion).employeeAddressesCreateWorkAddressRequest(employeeAddressesCreateWorkAddressRequest).execute();

Create an employee work address

The work address of an employee describes when an employee began working at an associated company location.  scope: &#x60;employees:manage&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeAddressesApi;
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
    String locationUuid = "locationUuid_example"; // Reference to a company location
    LocalDate effectiveDate = LocalDate.now(); // Date the employee began working at the company location
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      EmployeeWorkAddress result = client
              .employeeAddresses
              .createWorkAddress(employeeId)
              .locationUuid(locationUuid)
              .effectiveDate(effectiveDate)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getActive());
      System.out.println(result.getLocationUuid());
      System.out.println(result.getEmployeeUuid());
      System.out.println(result.getStreet1());
      System.out.println(result.getStreet2());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZip());
      System.out.println(result.getCountry());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#createWorkAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeWorkAddress> response = client
              .employeeAddresses
              .createWorkAddress(employeeId)
              .locationUuid(locationUuid)
              .effectiveDate(effectiveDate)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#createWorkAddress");
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
| **employeeAddressesCreateWorkAddressRequest** | [**EmployeeAddressesCreateWorkAddressRequest**](EmployeeAddressesCreateWorkAddressRequest.md)|  | [optional] |

### Return type

[**EmployeeWorkAddress**](EmployeeWorkAddress.md)

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

<a name="deleteHome"></a>
# **deleteHome**
> deleteHome(homeAddressUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Delete an employee&#39;s home address

Used for deleting an employee&#39;s home address.  Cannot delete the employee&#39;s active home address.  scope: &#x60;employees:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeAddressesApi;
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
    String homeAddressUuid = "homeAddressUuid_example"; // The UUID of the home address
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .employeeAddresses
              .deleteHome(homeAddressUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#deleteHome");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employeeAddresses
              .deleteHome(homeAddressUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#deleteHome");
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
| **homeAddressUuid** | **String**| The UUID of the home address | |
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

<a name="deleteWorkAddress"></a>
# **deleteWorkAddress**
> deleteWorkAddress(workAddressUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Delete an employee&#39;s work address

Used for deleting an employee&#39;s work address.  Cannot delete the employee&#39;s active work address.  scope: &#x60;employees:manage&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeAddressesApi;
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
    String workAddressUuid = "workAddressUuid_example"; // The UUID of the work address
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .employeeAddresses
              .deleteWorkAddress(workAddressUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#deleteWorkAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employeeAddresses
              .deleteWorkAddress(workAddressUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#deleteWorkAddress");
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
| **workAddressUuid** | **String**| The UUID of the work address | |
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

<a name="getHomeAddress"></a>
# **getHomeAddress**
> EmployeeAddress getHomeAddress(homeAddressUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get an employee&#39;s home address

The home address of an employee is used to determine certain tax information about them. Addresses are geocoded on create and update to ensure validity.  Supports home address effective dating and courtesy withholding.  scope: &#x60;employees:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeAddressesApi;
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
    String homeAddressUuid = "homeAddressUuid_example"; // The UUID of the home address
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      EmployeeAddress result = client
              .employeeAddresses
              .getHomeAddress(homeAddressUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getStreet1());
      System.out.println(result.getStreet2());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZip());
      System.out.println(result.getCountry());
      System.out.println(result.getActive());
      System.out.println(result.getUuid());
      System.out.println(result.getEmployeeUuid());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getCourtesyWithholding());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#getHomeAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeAddress> response = client
              .employeeAddresses
              .getHomeAddress(homeAddressUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#getHomeAddress");
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
| **homeAddressUuid** | **String**| The UUID of the home address | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**EmployeeAddress**](EmployeeAddress.md)

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

<a name="getHomeAddresses"></a>
# **getHomeAddresses**
> List&lt;EmployeeAddress&gt; getHomeAddresses(employeeId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get an employee&#39;s home addresses

The home address of an employee is used to determine certain tax information about them. Addresses are geocoded on create and update to ensure validity.  Supports home address effective dating and courtesy withholding.  scope: &#x60;employees:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeAddressesApi;
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
      List<EmployeeAddress> result = client
              .employeeAddresses
              .getHomeAddresses(employeeId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#getHomeAddresses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeAddress>> response = client
              .employeeAddresses
              .getHomeAddresses(employeeId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#getHomeAddresses");
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

[**List&lt;EmployeeAddress&gt;**](EmployeeAddress.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of employee addresses |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getWorkAddress"></a>
# **getWorkAddress**
> EmployeeWorkAddress getWorkAddress(workAddressUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get an employee work address

The work address of an employee is used for payroll tax purposes.  scope: &#x60;employees:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeAddressesApi;
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
    String workAddressUuid = "workAddressUuid_example"; // The UUID of the work address
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      EmployeeWorkAddress result = client
              .employeeAddresses
              .getWorkAddress(workAddressUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getActive());
      System.out.println(result.getLocationUuid());
      System.out.println(result.getEmployeeUuid());
      System.out.println(result.getStreet1());
      System.out.println(result.getStreet2());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZip());
      System.out.println(result.getCountry());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#getWorkAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeWorkAddress> response = client
              .employeeAddresses
              .getWorkAddress(workAddressUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#getWorkAddress");
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
| **workAddressUuid** | **String**| The UUID of the work address | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**EmployeeWorkAddress**](EmployeeWorkAddress.md)

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

<a name="listWorkAddresses"></a>
# **listWorkAddresses**
> List&lt;EmployeeWorkAddress&gt; listWorkAddresses(employeeId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get an employee&#39;s work addresses

Returns a list of an employee&#39;s work addresses. Each address includes its effective date and a boolean signifying if it is the currently active work address.  scope: &#x60;employees:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeAddressesApi;
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
      List<EmployeeWorkAddress> result = client
              .employeeAddresses
              .listWorkAddresses(employeeId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#listWorkAddresses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeWorkAddress>> response = client
              .employeeAddresses
              .listWorkAddresses(employeeId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#listWorkAddresses");
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

[**List&lt;EmployeeWorkAddress&gt;**](EmployeeWorkAddress.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of employee work addresses |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="updateHomeAddress"></a>
# **updateHomeAddress**
> EmployeeAddress updateHomeAddress(homeAddressUuid).xGustoAPIVersion(xGustoAPIVersion).employeeAddressesUpdateHomeAddressRequest(employeeAddressesUpdateHomeAddressRequest).execute();

Update an employee&#39;s home address

The home address of an employee is used to determine certain tax information about them. Addresses are geocoded on create and update to ensure validity.  Supports home address effective dating and courtesy withholding.  scope: &#x60;employees:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeAddressesApi;
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
    String homeAddressUuid = "homeAddressUuid_example"; // The UUID of the home address
    String street1 = "street1_example";
    String street2 = "street2_example";
    String city = "city_example";
    String state = "state_example";
    String zip = "zip_example";
    LocalDate effectiveDate = LocalDate.now();
    Boolean courtesyWithholding = true;
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      EmployeeAddress result = client
              .employeeAddresses
              .updateHomeAddress(version, homeAddressUuid)
              .street1(street1)
              .street2(street2)
              .city(city)
              .state(state)
              .zip(zip)
              .effectiveDate(effectiveDate)
              .courtesyWithholding(courtesyWithholding)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getStreet1());
      System.out.println(result.getStreet2());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZip());
      System.out.println(result.getCountry());
      System.out.println(result.getActive());
      System.out.println(result.getUuid());
      System.out.println(result.getEmployeeUuid());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getCourtesyWithholding());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#updateHomeAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeAddress> response = client
              .employeeAddresses
              .updateHomeAddress(version, homeAddressUuid)
              .street1(street1)
              .street2(street2)
              .city(city)
              .state(state)
              .zip(zip)
              .effectiveDate(effectiveDate)
              .courtesyWithholding(courtesyWithholding)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#updateHomeAddress");
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
| **homeAddressUuid** | **String**| The UUID of the home address | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **employeeAddressesUpdateHomeAddressRequest** | [**EmployeeAddressesUpdateHomeAddressRequest**](EmployeeAddressesUpdateHomeAddressRequest.md)|  | [optional] |

### Return type

[**EmployeeAddress**](EmployeeAddress.md)

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

<a name="updateWorkAddress"></a>
# **updateWorkAddress**
> EmployeeWorkAddress updateWorkAddress(workAddressUuid).xGustoAPIVersion(xGustoAPIVersion).employeeAddressesUpdateWorkAddressRequest(employeeAddressesUpdateWorkAddressRequest).execute();

Update an employee work address

The work address of an employee is used for payroll tax purposes.  scope: &#x60;employees:manage&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeAddressesApi;
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
    String workAddressUuid = "workAddressUuid_example"; // The UUID of the work address
    String version = "version_example"; // The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
    String locationUuid = "locationUuid_example"; // Reference to a company location
    LocalDate effectiveDate = LocalDate.now();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      EmployeeWorkAddress result = client
              .employeeAddresses
              .updateWorkAddress(workAddressUuid)
              .version(version)
              .locationUuid(locationUuid)
              .effectiveDate(effectiveDate)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getActive());
      System.out.println(result.getLocationUuid());
      System.out.println(result.getEmployeeUuid());
      System.out.println(result.getStreet1());
      System.out.println(result.getStreet2());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZip());
      System.out.println(result.getCountry());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#updateWorkAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeWorkAddress> response = client
              .employeeAddresses
              .updateWorkAddress(workAddressUuid)
              .version(version)
              .locationUuid(locationUuid)
              .effectiveDate(effectiveDate)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeAddressesApi#updateWorkAddress");
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
| **workAddressUuid** | **String**| The UUID of the work address | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **employeeAddressesUpdateWorkAddressRequest** | [**EmployeeAddressesUpdateWorkAddressRequest**](EmployeeAddressesUpdateWorkAddressRequest.md)|  | [optional] |

### Return type

[**EmployeeWorkAddress**](EmployeeWorkAddress.md)

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

