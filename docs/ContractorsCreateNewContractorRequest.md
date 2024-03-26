

# ContractorsCreateNewContractorRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The contractor type. |  |
|**wageType** | [**WageTypeEnum**](#WageTypeEnum) | The contractor’s wage type.  |  |
|**startDate** | **String** | The day when the contractor will start working for the company.  |  |
|**hourlyRate** | **String** | The contractor’s hourly rate. This attribute is required if the wage_type is &#x60;Hourly&#x60;. |  [optional] |
|**selfOnboarding** | **Boolean** | Whether the contractor or the payroll admin will complete onboarding in Gusto. Self-onboarding is recommended so that contractors receive Gusto accounts. If self_onboarding is true, then email is required. |  [optional] |
|**email** | **String** | The contractor’s email address. |  [optional] |
|**firstName** | **String** | The contractor’s first name. This attribute is required for &#x60;Individual&#x60; contractors and will be ignored for &#x60;Business&#x60; contractors. |  [optional] |
|**lastName** | **String** | The contractor’s last name. This attribute is required for &#x60;Individual&#x60; contractors and will be ignored for &#x60;Business&#x60; contractors. |  [optional] |
|**middleInitial** | **String** | The contractor’s middle initial. This attribute is optional for &#x60;Individual&#x60; contractors and will be ignored for &#x60;Business&#x60; contractors. |  [optional] |
|**fileNewHireReport** | **Boolean** | The boolean flag indicating whether Gusto will file a new hire report for the contractor. This attribute is optional for &#x60;Individual&#x60; contractors and will be ignored for &#x60;Business&#x60; contractors. |  [optional] |
|**workState** | **String** | State where the contractor will be conducting the majority of their work for the company. This value is used when generating the new hire report. This attribute is required for &#x60;Individual&#x60; contractors if &#x60;file_new_hire_report&#x60; is true and will be ignored for &#x60;Business&#x60; contractors. |  [optional] |
|**ssn** | **String** | This attribute is optional for &#x60;Individual&#x60; contractors and will be ignored for &#x60;Business&#x60; contractors. Social security number is needed to file the annual 1099 tax form. |  [optional] |
|**businessName** | **String** | The name of the contractor business. This attribute is required for &#x60;Business&#x60; contractors and will be ignored for &#x60;Individual&#x60; contractors. |  [optional] |
|**ein** | **String** | The employer identification number of the contractor business. This attribute is optional for &#x60;Business&#x60; contractors and will be ignored for &#x60;Individual&#x60; contractors. |  [optional] |
|**isActive** | **Boolean** | The status of the contractor. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;Individual&quot; |
| BUSINESS | &quot;Business&quot; |



## Enum: WageTypeEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;Fixed&quot; |
| HOURLY | &quot;Hourly&quot; |



