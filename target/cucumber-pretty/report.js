$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddTask.feature");
formatter.feature({
  "name": "Creation funtional and acceptance",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The user adds new task",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Acceptance"
    }
  ]
});
formatter.step({
  "name": "The user go to the page kanbanflow to login",
  "keyword": "Given "
});
formatter.match({
  "location": "KanbanStep.theUserGoToThePageKanbanflowToLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user adds to-do task",
  "keyword": "When "
});
formatter.match({
  "location": "KanbanStep.theUserAddsToDoTask()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The task was create",
  "keyword": "Then "
});
formatter.match({
  "location": "KanbanStep.theTaskWasCreate()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/InviteMember.feature");
formatter.feature({
  "name": "Creation funtional and acceptance",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The user add new member",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Acceptance"
    }
  ]
});
formatter.step({
  "name": "The user go to the page kanbanflow to login",
  "keyword": "Given "
});
formatter.match({
  "location": "KanbanStep.theUserGoToThePageKanbanflowToLogin()"
});
formatter.result({
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : }\n  (Session info: chrome\u003d76.0.3809.132): \nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027pepillo-Inspiron-5577\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.0.0-25-generic\u0027, java.version: \u00271.8.0_222\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.132, chrome: {chromedriverVersion: 76.0.3809.68 (420c9498db8ce..., userDataDir: /tmp/.com.google.Chrome.N4tiLF}, goog:chromeOptions: {debuggerAddress: localhost:43101}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: e75728e23d094d90486dc0fc6da9def6\n*** Element info: {Using\u003dcss selector, value\u003d[href\u003d\u0027/login\u0027]}\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\n\tat kanbanflow.ui.pages.PageTransporter.goToLoginPage(PageTransporter.java:16)\n\tat steps.KanbanStep.theUserGoToThePageKanbanflowToLogin(KanbanStep.java:36)\n\tat ✽.The user go to the page kanbanflow to login(file:src/test/resources/features/InviteMember.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "The user add new member",
  "keyword": "When "
});
formatter.match({
  "location": "KanbanStep.theUserAddNewMember()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The access is successfuly",
  "keyword": "Then "
});
formatter.match({
  "location": "KanbanStep.theAccessIsSuccessfuly()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Creation funtional and acceptance",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The user login to kanbanflow",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Acceptance"
    }
  ]
});
formatter.step({
  "name": "The user go to the page kanbanflow",
  "keyword": "Given "
});
formatter.match({
  "location": "KanbanStep.theUserGoToThePageKanbanflow()"
});
formatter.result({
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : }\n  (Session info: chrome\u003d76.0.3809.132): \nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027pepillo-Inspiron-5577\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.0.0-25-generic\u0027, java.version: \u00271.8.0_222\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.132, chrome: {chromedriverVersion: 76.0.3809.68 (420c9498db8ce..., userDataDir: /tmp/.com.google.Chrome.N4tiLF}, goog:chromeOptions: {debuggerAddress: localhost:43101}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: e75728e23d094d90486dc0fc6da9def6\n*** Element info: {Using\u003dcss selector, value\u003d[href\u003d\u0027/login\u0027]}\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\n\tat kanbanflow.ui.pages.PageTransporter.goToLoginPage(PageTransporter.java:16)\n\tat steps.KanbanStep.theUserGoToThePageKanbanflow(KanbanStep.java:25)\n\tat ✽.The user go to the page kanbanflow(file:src/test/resources/features/Login.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "The user login to kanbanflow",
  "keyword": "When "
});
formatter.match({
  "location": "KanbanStep.theUserLoginToKanbanflow()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The access is successfuly",
  "keyword": "Then "
});
formatter.match({
  "location": "KanbanStep.theAccessIsSuccessfuly()"
});
formatter.result({
  "status": "skipped"
});
});