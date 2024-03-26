

# TaxRequirement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A more detailed customer facing description of the requirement |  [optional] |
|**key** | **String** | An identifier for an individual requirement. Uniqueness is guaranteed within a requirement set. |  [optional] |
|**applicableIf** | [**List&lt;TaxRequirementApplicableIfInner&gt;**](TaxRequirementApplicableIfInner.md) | An array of references to other requirements within the requirement set. This requirement is only applicable if all referenced requirements have values matching the corresponding &#x60;value&#x60;. The primary use-case is dynamically hiding and showing requirements as values change. E.g. Show Requirement-B when Requirement-A has been answered with &#x60;false&#x60;. To be explicit, an empty array means the requirement is applicable. |  [optional] |
|**label** | **String** | A customer facing description of the requirement |  [optional] |
|**value** | **String** | The \&quot;answer\&quot; |  [optional] |
|**metadata** | [**TaxRequirementMetadata**](TaxRequirementMetadata.md) |  |  [optional] |



