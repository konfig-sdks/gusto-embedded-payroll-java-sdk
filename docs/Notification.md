

# Notification

Representation of a notification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the notification. This highlights the actionable component of the notification. |  [optional] |
|**uuid** | **String** | Unique identifier of a notification. |  [optional] |
|**companyUuid** | **String** | Unique identifier of the company to which the notification belongs. |  [optional] |
|**message** | **String** | The message of the notification. This provides additional context for the user and recommends a specific action to resolve the notification. |  [optional] |
|**category** | **String** | The notification&#39;s category. |  [optional] |
|**actionable** | **Boolean** | Indicates whether a notification requires action or not. If false, the notification provides critical information only. |  [optional] |
|**publishedAt** | **String** | Timestamp of when the notification was published. |  [optional] |
|**dueAt** | **String** | Timestamp of when the notification is due. If the notification has no due date, this field will be null. |  [optional] |
|**resources** | [**List&lt;NotificationResourcesInner&gt;**](NotificationResourcesInner.md) | An array of entities relevant to the notification |  [optional] |



