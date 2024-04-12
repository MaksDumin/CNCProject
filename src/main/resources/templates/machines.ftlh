<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h1>Цех №3 Механический</h1>
<h4>Рабочие центры</h4>
<form action="/" method="get">
    Поиск по названию Рабочего центра: <input type="text" name="title"> <br>
    <input type="submit" value="Поиск">
</form>
<#list machines as WorkCenter>
    <div>
        <p><b>${WorkCenter.title}</b>&nbsp${WorkCenter.code} &nbsp | <a href="/WorkCenter/${WorkCenter.id}"> Перейти...</a></p>

    </div>
    <#else>
    <h3> Список пуст </h3>
</#list>
<hr>
<h3>Добавить рабочий центр</h3>
<hr>
<form action="/WorkCenter/create" method="post">
    Название рабочего центра <input type="text" name="title"/><br><br>
    Код рабочего центра <input type="text" name="code"/><br><br>
    Узел ПЛМ <input type="text" name="plm"/><br><br>
    <input type="submit" value="Добавить РЦ"/>
</form>
</body>
</html>