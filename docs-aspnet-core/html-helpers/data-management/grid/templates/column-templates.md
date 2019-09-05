---
title: Column Templates
page_title: Column Templates | Telerik UI Grid HtmlHelper for ASP.NET Core
description: "Get started with the Telerik UI Grid HtmlHelper for ASP.NET Core and learn how to customize the way the column displays its value."
slug: column_templates_aspnetcore_grid
position: 2
---

# Column Templates

The Grid renders table rows (`tr`) which represent the data source items.

For runnable examples, refer to:
* [Demo on using the row template of the Grid HtmlHelper for ASP.NET Core](https://demos.telerik.com/aspnet-core/grid/rowtemplate)
* [Demo on using the detail-row template of the Grid HtmlHelper for ASP.NET Core](https://demos.telerik.com/aspnet-core/grid/detailtemplate)
* [Demo on using the toolbar template of the Grid HtmlHelper for ASP.NET Core](https://demos.telerik.com/aspnet-core/grid/toolbar-template)

Each table row consists of table cells (`td`) which represent the Grid columns. By default, the Grid displays the HTML-encoded value of the field in the column.

The following example demonstrates how to set the template as a string and wrap the column value in HTML.

        .Columns(c =>
        {
            c.Bound(f => f.ShipCountry).ClientTemplate("<strong>#= ShipCountry # </strong>");
        })

The following example demonstrates how to set column templates as a Kendo UI template.

        .Columns(c =>
        {
            c.Bound(f => f.ShipCountry).ClientTemplate("<strong>#= ShipCountry # </strong>");
        })

        <script type="kendo-template" id="my-template">
            <em>#= ShipCountry # </em>
        </script>

The following example demonstrates how to set a column template as a function.

        .Columns(c =>
        {
            c.Bound(f => f.Products).ClientTemplate("#=showProducts(data)#");
        })
        <script>
        function showProducts(data) {
            if (data.Products) {
                var template = "<ul>";
                for (var i = 0; i < data.Products.length; i++) {
                    var product = data.Products[i];                
                    template += kendo.format("<li>Product: {0}, Price: {1:c} </li>", product.ProductName, product.Price)    ;
                }
                template += "</ul>"
                return template;
            }
        }
        </script>

## See Also

* [Templates by the Grid HtmlHelper for ASP.NET Core (Demos)](https://demos.telerik.com/aspnet-core/grid/toolbar-template)
* [Server-Side API](/api/grid)