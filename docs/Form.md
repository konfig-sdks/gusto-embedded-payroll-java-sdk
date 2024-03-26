

# Form


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the form |  [optional] [readonly] |
|**description** | **String** | The description of the form |  [optional] [readonly] |
|**uuid** | **String** | The UUID of the form |  [optional] [readonly] |
|**name** | **String** | The type identifier of the form |  [optional] [readonly] |
|**draft** | **Boolean** | If the form is in a draft state. E.g. End of year tax forms may be provided in a draft state prior to being finalized. |  [optional] [readonly] |
|**year** | **Integer** | The year of this form. For some forms, e.g. tax forms, this is the year which the form represents. A W2 for January - December 2022 would be delivered in January 2023 and have a year value of 2022. This value is nullable and will not be present on all forms. |  [optional] [readonly] |
|**quarter** | **Integer** | The quarter of this form. For some forms, e.g. tax forms, this is the calendar quarter which this form represents. An Employer&#39;s Quarterly Federal Tax Return (Form 941) for April, May, June 2022 would have a quarter value of 2 (and a year value of 2022). This value is nullable and will not be present on all forms. |  [optional] [readonly] |
|**requiresSigning** | **Boolean** | A boolean flag that indicates whether the form needs signing or not. Note that this value will change after the form is signed. |  [optional] [readonly] |



