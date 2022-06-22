Feature:Search and Place the order for products

@offerpage

Scenario:Search experience for product search in both home and offers page

Given User is on GreenCart Landing page
When User searched with shortname <Name> and extracted actual name of product
Then User searched for <Name> shortname in offer page 
And check if product exist with same name


Examples:

| Name|
| Tom |
| Beet|
