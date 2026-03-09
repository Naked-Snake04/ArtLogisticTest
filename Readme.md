# Тестовое задание 

Создать проект Gradle для Java 17 с использованием плагинов Spring Boot 3 и OpenAPI generator, в котором в процессе сборки будет сгенерирована Java модель по спецификации https://api-prod.arvato.ru/resources/openapi/openapi.json

и предусмотрены успешные (ответ 200 и есть предусмотренный АРІ ответ) тесты Spring Boot в Моск окружении с использованием сгенерированной модели АРІ для:
- авторизации https://api-prod.arvato.ru/index.html#/login/login,
- регистрации тикета: https://api-prod.arvato.ru/index.html#/create%20request/pushRequest service = stockstate, date-to = 2025-12-31,
- получения данных по тикету:https://api-prod.arvato.ru/index.html#/request%20processing/getStockstate с одной записью stock-item.

# Инструкция для запуска

1. Склонировать репозиторий через `git clone https://github.com/Naked-Snake04/ArtLogisticTest.git`
2. Для генерации классов в папке `build` корне проекта выполнить команду `gradlew compileJava`.
После этого появятся сгенерированные классы по пути `build/generate-resources/main/src`)`.
3. Для запуска тестов выполнить команду `gradlew test`. Тесты находятся [Здесь](src/test/java/com/basov/sav/ArtLogisticTest/ArtLogisticTestApplicationTests.java).