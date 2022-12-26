<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Login Test Suite</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>09d19b82-30b3-474a-980e-447fae8a9c47</testSuiteGuid>
   <testCaseLink>
      <guid>c31a5ec0-16f8-4678-a87c-7d180dc5684b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/Login Success</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>c03ce345-53c8-4f77-b367-70c668fa6042</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Login/Data_Login</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>c03ce345-53c8-4f77-b367-70c668fa6042</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>07bf9da3-450c-41fe-b7d0-bdebcd2e1bcb</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c03ce345-53c8-4f77-b367-70c668fa6042</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>048b43d3-8617-40f7-a10a-0cb99f65c0cd</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>8fd10b6e-c28d-48f5-89eb-679dcb8a8a4f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/Login with empty password</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>6044e1b0-e097-41f3-944d-76f10cde9583</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Login/Data_Login</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>6044e1b0-e097-41f3-944d-76f10cde9583</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>99abe396-0970-49fb-b854-6219dd671200</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>52a2f848-17a4-45a3-9985-026d82463a27</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/Login with empty username</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>a2f7686c-3e80-4776-8bc3-dd83224f4216</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Login/Data_Login</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>a2f7686c-3e80-4776-8bc3-dd83224f4216</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>8618431e-61b0-485a-9218-ec7c1339e0d1</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>849d51b4-5997-4c9b-9ec8-f6e2bbc7f240</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/Login with empty username and password</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
