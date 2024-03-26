

# TaxRequirementMetadata



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Describes the type of requirement - each type may have additional metadata properties to describe possible values, formats, etc.  - &#x60;text&#x60;: free-text input, no additional requirements - &#x60;currency&#x60;: a value representing a dollar amount, e.g. &#x60;374.55&#x60; representing &#x60;$374.55&#x60; - &#x60;radio&#x60;: choose one of options provided, see &#x60;options&#x60; - &#x60;select&#x60;: choose one of options provided, see &#x60;options&#x60; - &#x60;percent&#x60;: A decimal value representing a percentage, e.g. &#x60;0.034&#x60; representing &#x60;3.4%&#x60; - &#x60;account_number&#x60;: An account number for a tax agency, more information provided by &#x60;mask&#x60; and &#x60;prefix&#x60; - &#x60;tax_rate&#x60;: A decimal value representing a tax rate, e.g. &#x60;0.034&#x60; representing a tax rate of &#x60;3.4%&#x60;, see &#x60;validation&#x60; for additional validation guidance - &#x60;workers_compensation_rate&#x60;: A decimal value representing a percentage, see &#x60;risk_class_code&#x60;, &#x60;risk_class_description&#x60;, and &#x60;rate_type&#x60;  |  [readonly] |
|**options** | [**List&lt;TaxRequirementMetadataOptionsInner&gt;**](TaxRequirementMetadataOptionsInner.md) | [for &#x60;select&#x60; or &#x60;radio&#x60;] An array of objects describing the possible values. |  [optional] |
|**riskClassCode** | **String** | [for &#x60;workers_compensation_rate&#x60;] The industry risk class code for the rate being requested |  [optional] |
|**riskClassDescription** | **String** | [for &#x60;workers_compensation_rate&#x60;] A description of the industry risk class for the rate being requested |  [optional] |
|**rateType** | [**RateTypeEnum**](#RateTypeEnum) | [for &#x60;workers_compensation_rate&#x60;] The type of rate being collected. Either:  - &#x60;percent&#x60;: A percentage formatted as a decimal, e.g. &#x60;0.01&#x60; for 1%  - &#x60;currency_per_hour&#x60;: A dollar amount per hour, e.g. &#x60;3.24&#x60; for $3.24/hr  |  [optional] |
|**mask** | **String** | [for &#x60;account_number&#x60;] A pattern describing the format of the account number  The mask is a sequence of characters representing the requirements of the actual account number. Each character in the mask represents a single character in the account number as follows: - &#x60;#&#x60;: a digit (&#x60;\\d&#x60;) - &#x60;@&#x60;: a upper or lower case letter (&#x60;[a-zA-Z]&#x60;) - &#x60;^&#x60;: an uppercase letter (&#x60;[A-Z]&#x60;) - &#x60;%&#x60;: a digit or uppercase letter (&#x60;[0-9A-Z]&#x60;) - any other character represents the literal character  Examples: - mask: &#x60;WHT-######&#x60; represents &#x60;WHT-&#x60; followed by 5 digits, e.g. &#x60;WHT-33421&#x60; - mask: &#x60;%####-^^&#x60; supports values of &#x60;75544-AB&#x60; and &#x60;Z7654-HK&#x60;  |  [optional] |
|**prefix** | **String** | [for &#x60;account_number&#x60;] A value that precedes the value to be collected - useful for display, but should not be submitted as part of the value. E.g. some tax agencies use an account number that is a company&#39;s federal ein plus two digits. In that case the mask would be &#x60;##&#x60; and the prefix &#x60;XXXXX1234&#x60;. |  [optional] |
|**validation** | [**TaxRequirementMetadataValidation**](TaxRequirementMetadataValidation.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;text&quot; |
| CURRENCY | &quot;currency&quot; |
| RADIO | &quot;radio&quot; |
| SELECT | &quot;select&quot; |
| PERCENT | &quot;percent&quot; |
| ACCOUNT_NUMBER | &quot;account_number&quot; |
| TAX_RATE | &quot;tax_rate&quot; |
| WORKERS_COMPENSATION_RATE | &quot;workers_compensation_rate&quot; |



## Enum: RateTypeEnum

| Name | Value |
|---- | -----|
| PERCENT | &quot;percent&quot; |
| CURRENCY_PER_HOUR | &quot;currency_per_hour&quot; |



