
**Relational Operators:**
Relational operators in Java are used to compare values and determine the relationships between them. They return a boolean value (`true` or `false`) based on whether the comparison is true or false.

1. **Equal to (`==`)**: This operator checks if two values are equal.

```java
int a = 5;
int b = 7;
boolean isEqual = (a == b); // false
```

2. **Not equal to (`!=`)**: This operator checks if two values are not equal.

```java
int x = 10;
int y = 10;
boolean isNotEqual = (x != y); // false
```

3. **Greater than (`>`)**: This operator checks if the left operand is greater than the right operand.

```java
int p = 15;
int q = 12;
boolean isGreaterThan = (p > q); // true
```

4. **Less than (`<`)**: This operator checks if the left operand is less than the right operand.

```java
int m = 8;
int n = 10;
boolean isLessThan = (m < n); // true
```

5. **Greater than or equal to (`>=`)**: This operator checks if the left operand is greater than or equal to the right operand.

```java
int num1 = 25;
int num2 = 25;
boolean isGreaterThanOrEqual = (num1 >= num2); // true
```

6. **Less than or equal to (`<=`)**: This operator checks if the left operand is less than or equal to the right operand.

```java
int value1 = 30;
int value2 = 35;
boolean isLessThanOrEqual = (value1 <= value2); // true
```

**Logical Operators:**
Logical operators in Java are used to perform logical operations on boolean values. They also return a boolean value.

1. **Logical AND (`&&`)**: This operator returns `true` if both operands are `true`.

```java
boolean condition1 = true;
boolean condition2 = false;
boolean logicalANDResult = (condition1 && condition2); // false
```

2. **Logical OR (`||`)**: This operator returns `true` if at least one of the operands is `true`.

```java
boolean statement1 = false;
boolean statement2 = true;
boolean logicalORResult = (statement1 || statement2); // true
```

3. **Logical NOT (`!`)**: This operator is used to negate the value of a boolean expression.

```java
boolean originalValue = true;
boolean negatedValue = !originalValue; // false
```

These operators play a crucial role in decision-making, control flow, and boolean expressions in Java programs. They allow you to perform comparisons and combine boolean values to make more complex logical decisions.