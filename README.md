This is a Kotlin Multiplatform project targeting Android, iOS.

* [/composeApp](./composeApp/src) is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - [commonMain](./composeApp/src/commonMain/kotlin) is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    the [iosMain](./composeApp/src/iosMain/kotlin) folder would be the right place for such calls.
    Similarly, if you want to edit the Desktop (JVM) specific part, the [jvmMain](./composeApp/src/jvmMain/kotlin)
    folder is the appropriate location.

* [/iosApp](./iosApp/iosApp) contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform,
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

### Build and Run Android Application

To build and run the development version of the Android app, use the run configuration from the run widget
in your IDE’s toolbar or build it directly from the terminal:
- on macOS/Linux
  ```shell
  ./gradlew :composeApp:assembleDebug
  ```
- on Windows
  ```shell
  .\gradlew.bat :composeApp:assembleDebug
  ```

### Build and Run iOS Application

To build and run the development version of the iOS app, use the run configuration from the run widget
in your IDE’s toolbar or open the [/iosApp](./iosApp) directory in Xcode and run it from there.

---

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…


# Product Browser App (Kotlin Multiplatform)

A cross-platform product catalog prototype built using **Kotlin Compose Multiplatform**.  
The application demonstrates **Clean Architecture**, API integration, and reactive UI state management.

## Features

- View product list with name, price, and thumbnail
- View detailed product information
- Search products using API
- Optional filtering by category

## Tech Stack

- Kotlin Multiplatform
- Compose Multiplatform
- Ktor Client
- kotlinx.serialization
- StateFlow
- Clean Architecture

## API

This project uses the DummyJSON API to simulate a product catalog backend.

https://dummyjson.com/products

## Architecture

data → API / DTO / Repository
domain → Models / Use cases
presentation → ViewModel / Compose UI

## Running the Project

1. Clone the repository
2. Open in Android Studio
3. Sync Gradle
4. Run the Android target

## Author

Shaik Fahad
