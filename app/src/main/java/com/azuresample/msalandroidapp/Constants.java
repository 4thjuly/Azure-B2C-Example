package com.azuresample.msalandroidapp;

/**
 * Created by dadaboli on 4/20/17.
 */

public class Constants {

    /* Azure AD b2c Configs */
    final static String AUTHORITY = "https://login.microsoftonline.com/tfp/%s/%s";
//    final static String TENANT = "fabrikamb2c.onmicrosoft.com";
//    final static String CLIENT_ID = "90c0fe63-bcf2-44d5-8fb7-b8bbc0b29dc6";
    final static String TENANT = "IanETB2CTenant.onmicrosoft.com";
    final static String CLIENT_ID = "04057cd2-290a-4819-94d9-e131e93f1d10";
    final static String SCOPES = "email";
    final static String API_URL = "https://api-app-test-1.azurewebsites.net/api/test";

    final static String SISU_POLICY = "B2C_1_SUSI";
    final static String EDIT_PROFILE_POLICY = "B2C_1_edit_profile";
}
