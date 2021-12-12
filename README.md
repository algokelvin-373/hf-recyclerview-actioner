<h1 align="center">HBF Recyclerview Actioner</h1>
<h3 align="center">(Header - Body - Footer ) Recyclerview Actioner</h3>

<p align="center">
  <a href="https://jitpack.io/#algokelvin-373/hf-recyclerview-actioner"><img alt="bintray" src="https://jitpack.io/v/algokelvin-373/hf-recyclerview-actioner.svg"></a>
  <a href="LICENSE"><img alt="License" src="https://img.shields.io/github/license/algokelvin-373/hf-recyclerview-actioner"></a>
  <a href="https://github.com/algokelvin-373"><img alt="Github" src="https://img.shields.io/github/followers/algokelvin-373?label=follow&style=social"></a>
  <a href="https://www.youtube.com/c/AlgoKelvin373/"><img alt="Youtube" src="https://img.shields.io/youtube/channel/views/UCpSHZFRx64xWwXYbWbyXxfw?style=social"></a>
  <a href="https://www.youtube.com/c/AlgoKelvin373/"><img alt="Youtube" src="https://img.shields.io/youtube/channel/subscribers/UCpSHZFRx64xWwXYbWbyXxfw?style=social"></a>
</p>

## Description

Coming Soon

## Demo Program

Coming Soon

## _Step by Step to implement this_

#### 1. Add the JitPack repository to your `build.gradle`
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
  ```
  #### 2. Add Module dependency in your `app/build.gradle`
  ```gradle
  dependencies {
    implementation 'com.github.algokelvin-373:hf-recyclerview-actioner:${version}'
  }
  ```
  #### 3. Implement `RecyclerViewBody`
  ```kotlin
  RecyclerViewBody(this, [id_recyclerview], [size], [layout_item]) { view, position ->
    ...
  }
  ```
  <table>
    <tr>
      <th>id / parameters</th>
      <th>Description</th>
    </tr>
    <tr>
      <td>id_recyclerview</td>
      <td>Id names for layout Recyclerview (using KTE)</td>
    </tr>
    <tr>
      <td>size</td>
      <td>Define Size or Length Data List / Array / ArrayList</td>
    </tr>
    <tr>
      <td>layout_item</td>
      <td>Define Name Layout for Item Data Recyclerview</td>
    </tr>
    <tr>
      <td>view</td>
      <td>View for <b>layout_item</b></td>
    </tr>
    <tr>
      <td>position</td>
      <td>Define Position data</td>
    </tr>
  </table>

### Contributions

Any contributions are welcome. You can send PR or open issues.
Thank you

### LICENSE
```
Copyright [2021] [AlgoKelvin]

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
