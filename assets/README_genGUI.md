# Tổng quan
- Plugins UISL phát triển trên nền tảng Eclipse, hỗ trợ sinh tự động giao diện người dùng từ đặc tả ca sử dụng. 
- Đầu vào: đặc tả ca sử dụng dưới dạng FRSL hoặc FRSLAS.
- Đầu ra: mô hình luồng tương tác. Chế tác cuối cùng là giao diện người dùng (mã nguồn HTML).
![image](https://user-images.githubusercontent.com/56378286/167662892-43ea4232-477c-4c68-b0a8-5f1cf21d8feb.png "Tổng quan quá trình chuyển đổi UISL")

# Chuẩn bị môi trường
- Eclipse: https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2022-03/R/eclipse-dsl-2022-03-R-win32-x86_64.zip
- UML2 Extender SDK bằng Install New Software
- Sirius 7.0 bằng Eclipse Marketplace
- Acceleo 3.7 bằng Eclipse Marketplace
- ATL/EMFTVM 4.2.1 bằng Eclipse Marketplace
- FRSL Plugins: https://github.com/vnu-frsl/frsl-all (Nếu sử dụng đầu vào là frsl).

# Cài đặt
*Sử dụng các thư mục có sẵn tại thư mục /UISL.*
## Cách 1: Sử dụng như là 1 plugins
### Cấu trúc thư mục
- Đặt các plugins trong /UISL/Plugins vào trong Eclipse/plugins.
- Cấu trúc các thư mục trong Eclipse tương ứng như sau:
```
Eclipse project
├── runtime-frsl
|  ├── pos
|  ├── test
├── workspace
|  ├── IFML2GUI
|  ├── IFML2GUI.ui
|  ├── org.eclipse.acceleo.module.sample
|  ├── FRSL Plugins
```
- Thư mục **test** là nơi chứa dữ liệu đầu vào, đặc tả file .frsl, .frslas tại đây.
- Thư mục **pos** là nơi chứa mã nguồn đầu ra và mô hình luồng tương tác.
- FRSL Plugins được clone và đặt vào để hỗ trợ chuyển đổi đặc tả ca sử dụng dạng FRSL sang FRSLAS.

### Cách sử dụng chương trình
* Bước 1 : Chạy Runtime
![image](https://user-images.githubusercontent.com/56378286/167671351-ae844c70-0542-4030-8ffa-dec2c64aa404.png "Bước 1: Chạy Runtime")

* Bước 2 : Đặc tả đầu vào tại thư mục **/test**
  
  * Optional : Đặc tả ca sử dụng dạng FRSL
    * Chuyển đổi FRSL sang FRSLAS
 
  ![image](https://user-images.githubusercontent.com/56378286/167672269-8279d0d1-6da8-4682-8f66-4deae6f8ac99.png "Chuyển đổi FRSL sang FRSLAS")
  * Hoặc Đặc tả ca sử dụng dạng FRSLAS
  
* Bước 3 : Sinh mô hình luồng tương tác từ FRSLAS
  
  * *Chuột phải vào tệp FRSLAS -> Chọn FRSL to UISL -> Run transformation*.
  ![image](https://user-images.githubusercontent.com/56378286/167672702-68c2de2b-2495-42c6-a630-5e458583adba.png "Sinh mô hình luồng tương tác từ FRSLAS")
  
  * Đặc tả cho mô hình luồng tương tác được thể hiện ở thư mục **pos/My.pos_v3** .
  
  * Để hiển thị dưới dạng biểu đồ trực quan: *Mở thư mục My.aird dưới dạng Aird Editor -> New Representations -> Chọn My.pos_v3 -> Đặt tên cho biểu đồ*.

  ![image](https://user-images.githubusercontent.com/56378286/167673020-e5caafb8-988b-4c37-9b60-8f076c82c50d.png "Hiển thị mô hình luồng tương tác dạng biểu đồ")
  
  * Ta có thể chỉnh sửa bằng kéo thả các thành phần chính để chỉnh sửa mô hình luồng tương tác cho đến khi đạt đến độ hoàn chỉnh.
 
* Bước 4 : Sinh tự động giao diện từ mô hình luồng tương tác
 
  * Sau khi hoàn tất chỉnh sửa, ta thực hiện các bước sau để sinh tự động giao diện người dùng: *Chuột phải vào My.pos_v3 -> Chọn Acceleo Model to text -> Chọn Generate IFML2GUI*.
  
  ![image](https://user-images.githubusercontent.com/56378286/167673358-9484b5a5-e32f-4070-bc38-467c84b076eb.png "Sinh tự động giao diện người dùng")
  
  * Mã nguồn HTML được lưu ở thư mục **pos/src-gen/My.project**.




