# Playwright
Why Use Playwright ?
.Eliminates flasky tests 
. Cross Browser and Cross Platform
. Fast Execution 
.Great reporting tools
.Work out of the box

What is Page in Playwright ?

In Playwright, the Page class represents a single web page in a browser context. It provides methods and properties to interact with the web page, such as navigating to URLs, interacting with elements, executing JavaScript code, and more.

Here are some common tasks you can perform using the Page class in Playwright:

Navigating to a URL:

page.navigate("https://www.bestbuy.com/"): Loads the specified URL in the page.
Waiting for the page to load:

page.waitForLoadState(LoadState.NETWORKIDLE): Waits for the page to reach the network idle state.
Querying elements:

page.querySelector("selector"): Finds the first element that matches the given CSS selector.
page.querySelectorAll("selector"): Finds all elements that match the given CSS selector.
