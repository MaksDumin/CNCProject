<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<#--<h1>Цех №3 Механический</h1>
<h4>Рабочие центры</h4>
<form action="/" method="get">
    Поиск по названию Рабочего центра: <input type="text" name="center"> <br>
    <input type="submit" value="Поиск">
</form>-->
<#list machines as WorkCenter>
    <div>
        <p><b>${WorkCenter.center}</b>&nbsp${WorkCenter.error} &nbsp | <a href="/WorkCenter/${WorkCenter.id}"> Перейти...</a></p>

    </div>
    <#else>
    <h3> Список пуст </h3>
</#list>
<hr>
<h3>Добавить рабочий центр</h3>
<hr>
<form action="/WorkCenter/create" method="post">
    Рабочий центр <input type="text" name="center"/><br><br>
    Событие <input type="text" name="error"/><br><br>
    Дата/время <input type="text" name="data"/><br><br>
    <input type="submit" value="Добавить событие"/>
</form>
</body>
</html>