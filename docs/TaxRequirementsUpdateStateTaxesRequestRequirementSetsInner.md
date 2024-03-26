

# TaxRequirementsUpdateStateTaxesRequestRequirementSetsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | An identifier for a set of requirements. A list of requirement sets can contain multiple sets with the same &#x60;key&#x60; and different &#x60;effective_from&#x60; values. |  [optional] |
|**effectiveFrom** | **String** | An ISO 8601 formatted date representing the date values became effective. Some requirement sets are effective dated, while others are not. Multiple requirement sets for the same state/key can/will exist with unique effective dates. If a requirement set is has an &#x60;effective_from&#x60; value, all requirement sets with the same key will also have an &#x60;effective_from&#x60; value. |  [optional] |
|**state** | **String** | One of the two-letter state abbreviations for the fifty United States and the District of Columbia (DC) |  [optional] |
|**requirements** | [**List&lt;TaxRequirementsUpdateStateTaxesRequestRequirementSetsInnerRequirementsInner&gt;**](TaxRequirementsUpdateStateTaxesRequestRequirementSetsInnerRequirementsInner.md) |  |  [optional] |



