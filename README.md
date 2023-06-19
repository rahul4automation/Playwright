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

Interacting with elements:

element.click(): Clicks on the element.
element.fill("value"): Enters a value into an input element.
element.innerText(): Retrieves the text content of an element.
element.getAttribute("attributeName"): Retrieves the value of the specified attribute of an element.
Executing JavaScript code on the page:

page.evaluate("javascriptCode"): Executes JavaScript code within the context of the page.
page.evaluateHandle("javascriptCode"): Executes JavaScript code and returns a handle to the result.
Taking screenshots:

page.screenshot(new Page.ScreenshotOptions().setPath("screenshot.png")): Captures a screenshot of the page.


what is browser in playwright


In Playwright, the Browser class represents a web browser instance. It provides methods to launch and control a browser, create new browser contexts, and manage multiple browser instances.

Here are some key features and functionalities of the Browser class in Playwright:

Launching a browser:

BrowserType.launch(): Launches a new instance of a web browser.
Browser.newContext(): Creates a new browser context within the browser instance.
Creating browser contexts:

Browser.newContext(): Creates a new browser context, which represents an isolated browsing session.
BrowserContext.newPage(): Creates a new page within a browser context.
Controlling the browser:

Browser.close(): Closes the browser and all its associated contexts and pages.
Browser.isConnected(): Checks if the browser instance is connected or closed.
Managing browser contexts:

BrowserContext.newPage(): Creates a new page within a browser context.
BrowserContext.close(): Closes the browser context and all its associated pages.
Managing browser instances:

BrowserType.launch(): Launches a new instance of a web browser.
BrowserType.connect(): Connects to an existing browser instance.
BrowserType.close(): Closes all running browser instances.
Configuring browser options:

BrowserType.launch(new BrowserType.LaunchOptions().setHeadless(true)): Configures the launch options for the browser, such as running in headless mode.
