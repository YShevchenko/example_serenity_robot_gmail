Scenario: Verify text file sent successfully via Gmail
Given sender user logins in to Gmail with email <senderEmail> and password <senderPassword>
When user sends following email with timestamp added in subject:
|subject  |recipientEmail           |message     |attachmentFilePath   |
|Test mail|jane.doe.310716@gmail.com|Test Message|C:\testAttachment.txt|
And recipient user re-logins in to Gmail with email <recipientEmail> and password <recipientPassword>
And user searches for mail by stored timestamp
And user opens attachment in found email
Then attachment should contain text <line1>

Examples:
{transformer=FROM_LANDSCAPE}
|senderEmail              |john.doe.310716@gmail.com                                 |
|senderPassword           |Password310716                                            |
|recipientEmail           |jane.doe.310716@gmail.com                                 |
|recipientPassword        |Password310716                                            |
|line1                    |Test Attachment Text<endline>lorem ipsum<endline>dot lorem|