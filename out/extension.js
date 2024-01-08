"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.activate = void 0;
const vscode_1 = require("vscode");
const HelloWorldPanel_1 = require("./panels/HelloWorldPanel");
const provider_1 = require("./panels/provider");
const vscode = require("vscode");
function activate(context) {
    // Create the show hello world command
    const showHelloWorldCommand = vscode_1.commands.registerCommand("hello-world.showHelloWorld", () => {
        HelloWorldPanel_1.HelloWorldPanel.render(context.extensionUri);
    });
    // Add command to the extension context
    context.subscriptions.push(showHelloWorldCommand);
    // Instantiate a new instance of the WeatherViewProvider class
    const provider = new provider_1.AuroraProvider(context.extensionUri);
    // Register the provider for a Webview View
    const webviewViewDisposable = vscode.window.registerWebviewViewProvider(provider_1.AuroraProvider.viewType, provider, {
        webviewOptions: {
            retainContextWhenHidden: true
        }
    });
    context.subscriptions.push(webviewViewDisposable);
}
exports.activate = activate;
//# sourceMappingURL=extension.js.map