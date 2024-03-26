

# TaxRequirementMetadataValidation

[for `tax_rate`] Describes the validation required for the tax rate

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Describes the type of tax_rate validation rule |  |
|**min** | **String** | [for &#x60;min_max&#x60;] The inclusive lower bound of the tax rate |  [optional] |
|**max** | **String** | [for &#x60;min_max&#x60;] The inclusive upper bound of the tax rate |  [optional] |
|**rates** | **List&lt;String&gt;** | [for &#x60;one_of&#x60;] The possible, unformatted tax rates for selection. - e.g. [\&quot;0.0\&quot;, \&quot;0.001\&quot;] representing 0% and 0.1%  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ONE_OF | &quot;one_of&quot; |
| MIN_MAX | &quot;min_max&quot; |



