# HW_Magics_DRY_SOLID

### DRY - класс Launcher, метод selectСategoryMenu
  Можем создать список с абсолютно другим каталогом чего - либо. Передать новый лист в метод и он будет отрабатывать также.
  Тоже самое касаемо метода filterMenu. При необходимости можем отфильтровать иной каталог товаров.
## SOLID

### 1. Single-responsibility principle - класс Filter, 
    У класса есть своя отдельная функция - фильтровать товары
### 2. Open-closed principle - класс AdderWithOrder расширяет класс Adder.
    При необходимости добавляем методы, если мы хотим изменить логику, такие как placeBuyerOrder к примеру.
  
### 3. Liskov substitution principle - Класс AdderWithOrder, который расширяет класс Adder.
    Наследник выполняет все те же функции, что и родитель, и может его заменить.
### 4. Interface segregation principle - классы Laptop и Phone 
    Класс Laptop, который имплиментирует 2 разных интерфейса, которые "применимы" к ноутам.
    а класс Phone имплиментирует только те интерфейсы, которые относятся к телефонам.*/
### 5. Dependency inversion principle - класс Launcher. Метод selectСategoryMenu.
    Oбъект Adder adder = new AdderWithOrder() - мы можем также сделать через CatalogAdder summator = new AdderWithOrder()
    и тогда у нас все будет доступно через интерфейс CatalogAdder.
