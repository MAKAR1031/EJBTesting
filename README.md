# Демонстрация различных способов тестирования EJB компонетов

### [SimpleUnitTests](SimpleUnitTests/)
В данном проекте рассмотрен простейший [пример](/SimpleUnitTests/SimpleUnitTests-ejb/src/test/java/ru/makar/tests/CalculatorServiceTest.java) тестирования, когда существует [компонент](/SimpleUnitTests/SimpleUnitTests-ejb/src/main/java/ru/makar/services/CalculatorService.java) без зависимостей. 

### [UnitTestWithDependencies](UnitTestWithDependencies/)
Этот проект демонстрирует то, как можно тестировать [компонент](/UnitTestWithDependencies/UnitTestWithDependencies-ejb/src/main/java/ru/makar/services/OrderService.java), который имеет одну зависимость.
Для реализации [теста](/UnitTestWithDependencies/UnitTestWithDependencies-ejb/src/test/java/tests/OrderServiceTests.java) используется фреймворк **Mockito** для создания mock-объекта, который будет имитировать зависимость тестируемого компонента.