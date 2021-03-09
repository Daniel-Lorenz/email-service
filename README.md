# A simple email service

This small Java application can be used to send emails from an associated gmail (or any other email) account.

Note that you need access to the email account from which the emails are supposed to be sent.

## How to use

In order to use this example service, you have to
1. specify the email address, passwort and username in the `application.properties` file (or in your cloud environment)
1. check the SMTP configuration used in the [EmailSender](https://github.com/Daniel-Lorenz/email-service/blob/master/src/main/java/de/itelligence/emailservice/email/EmailSender.java#L29-L33)
The default settings should work with gmail.
1. deploy it somewhere (e.g. SAP CP CF)

### How to use - with gmail
In order to use this service with gmail, you have to enable [**access for less secure apps**](https://support.google.com/accounts/answer/6010255#zippy=%2Cif-less-secure-app-access-is-on-for-your-account) because this service is not using OAuth2 to authenticate with google.

I would recommend to **not use your personal** email account. Instead go ahead and create a dummy email account =)
