<img align="left" width="116" height="116" src="https://raw.githubusercontent.com/liannoi/sample-android/master/.github/icon.png" />

# Sample Android

[![BCH compliance](https://bettercodehub.com/edge/badge/liannoi/sample-android?branch=master)](https://bettercodehub.com/)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/4a2390d535f84369adc41b8156f630a5)](https://www.codacy.com/manual/liannoi/sample-android?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=liannoi/sample-android&amp;utm_campaign=Badge_Grade)
[![Maintainability](https://api.codeclimate.com/v1/badges/f4caf431b82e9f80469a/maintainability)](https://codeclimate.com/github/liannoi/sample-android/maintainability)
[![CodeFactor](https://www.codefactor.io/repository/github/liannoi/sample-android/badge)](https://www.codefactor.io/repository/github/liannoi/sample-android)

<br />
<img align="right" src="https://raw.githubusercontent.com/liannoi/sample-android/master/.github/screenshot-01.png" alt="Main screenshot" width="288" height="512" style="display: inline; float: right" />

This project is one of my homework at the STEP Computer Academy on the topic of architecture. The
idea is to contact a remote data source, pick up data in JSON format from there, map it through a
converter to data types and display it on the main activity in a beautiful presentation.

The project is implemented in **MVVM architecture** in the **Kotlin** programming language, using certain
technologies (see Technologies for full details). The implementation was very exciting, if only
because I adapted the [**Google example**](https://github.com/android/architecture-samples) for my task.
I will continue to do this in the future for medium and large mobile applications for Android, since
it turned out to be a really excellent (in my opinion) example. This example uses fantastic plugins
that I saw the first time around, like ```kotlin-android```, ```kotlin-kapt```, and
```androidx.navigation.safeargs.kotlin```. These plugins generate Java classes based on fragment
bindings for ViewModels. It was also interesting to see how the activity is implemented, given its
specificity / lifecycle.

All in all, I would be happy to see something like this example, about a couple of weeks ago. All
the same, the example is very similar to the example from Google, it uses the same techniques and
practices, but at the same time - the example is a little simpler and it shows clearer edges of the
layers of the client application architecture on Android.

> The development and support of this project isn't planned, since there are still many new topics and
> subjects ahead, and, accordingly, works.

## Technologies

* Gson 2.8
* Retrofit 2.9
* RxAndroid 2.1
* RxJava 2.2
* Android Architecture Components

## Getting Started

Use these instructions to install and run this project on your mobile device / emulator.

### Prerequisites

You will need the following tools:

* [Android Studio](https://developer.android.com/studio) (version 4.0 or later)
* [Android SDK Platform](https://developer.android.com/studio/releases/platforms#10) (version 29 or later)

### Setup

Follow the instructions below to install and run:

1. Clone the repository.

   ```
   git clone https://github.com/liannoi/sample-android.git
   ```

2. Open the project in Android Studio.

3. Connect your phone via USB to your computer or select from the list of available emulators.

4. Launch the application with the keyboard shortcut ```⌃R``` (Mac).

## License

This repository is licensed under [Apache-2.0](https://github.com/liannoi/sample-android/blob/master/LICENSE).

```
Copyright 2020 Maksym Liannoi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
