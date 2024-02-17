<!DOCTYPE html>
<html>
<head>
    <title>Proxor's shop</title>
</head>
<body>
<h1>BUYSELL shop</h1>
<hr>
<h4>Те, кто верит – налетай. Те, кто жадный – убегай.<br>
    Отделяем мух от котлет, а тех, кто мне верит – от тех, кто нет.<br>
    Для вас свеженький товарчик, а для нас – солидный наварчик.<br>
    Товар без изъяна, товар без обмана. Надёжный, как пружина от дивана!<br>
    Берём мешками, мешками берём! Я вчера один полный взял и всего на 10 фунтов попал.<br>
</h4>
<form action="/" method="get">
    Поиск товара по названию: <input type="text" name="title"><br>
    <input type="submit" value="Поиск">
</form>
<#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.price} руб. | <a href="/product/${product.id}">Детали</a></p>
        <#else>
        <b>Список товаров пуст</b>
    </div>
</#list>
<hr>
<h3>Добавить новый товар</h3>
<form action="/product/create" method="post" enctype="multipart/form-data">
    Название товара: <input type="text" name="title"><br><br>
    Описание товара: <input type="text" name="description"><br><br>
    Цена: <input type="number" name="price"><br><br>
    Город: <input type="text" name="city"><br><br>
    <input type="submit" value="Добавить товар">
</form>
</body>
</html>