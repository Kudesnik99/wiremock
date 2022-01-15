# wiremock

**Вот это не работает:**  
```"urlPathPattern": "/data/2.5/weather?lat=(^[0-9]*[.,][0-9]+$)&lon=(^[0-9]*[.,][0-9]+$)&units=metric&APPID=([0-9a-fA-F]{32})"```

**Для Yandex эмулятора было:**  
```"urlPattern"``` вместо ```"urlPathPattern"```