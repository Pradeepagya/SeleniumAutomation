$(document).ready(function() {
CucumberHTML.timelineItems.pushArray([
  {
    "id": "9aa6ba9c-47ef-4812-98a8-c6f0664c32e3",
    "feature": "Login page feature",
    "scenario": "Forgot Password link",
    "start": 1615369671826,
    "group": 13,
    "content": "",
    "tags": "@login,@smoke,",
    "end": 1615369687818,
    "className": "failed"
  },
  {
    "id": "440031a0-e5dc-423e-ac81-35761a62a4fc",
    "feature": "Login page feature",
    "scenario": "Login with correct credentials",
    "start": 1615369671869,
    "group": 14,
    "content": "",
    "tags": "@login,@regression,@skip_scenario,",
    "end": 1615369676507,
    "className": "skipped"
  },
  {
    "id": "f1918372-ae8e-4803-8aad-23cd0cc6a10f",
    "feature": "Login page feature",
    "scenario": "Login page title",
    "start": 1615369671870,
    "group": 12,
    "content": "",
    "tags": "@login,@smoke,",
    "end": 1615369688084,
    "className": "passed"
  }
]);
CucumberHTML.timelineGroups.pushArray([
  {
    "id": 12,
    "content": "Thread[TestNG-PoolService-0,5,main]"
  },
  {
    "id": 13,
    "content": "Thread[TestNG-PoolService-1,5,main]"
  },
  {
    "id": 14,
    "content": "Thread[TestNG-PoolService-2,5,main]"
  }
]);
});