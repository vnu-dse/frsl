# Plugin cú pháp đồ họa của FRSL
## Cài đặt môi trường
- Download **Eclipse DSL** (https://www.eclipse.org/downloads/packages/release/juno/sr1-rc2/eclipse-java-and-dsl-tools).
## Cài đặt công cụ hỗ trợ
Giải nén và Mở eclipse mới cài đặt sau đó và thực hiện cài đặt các plugin sau:
- Chọn `Help > Install New Software...`
  - Install **Sirius 7.0**
  - Install **UML2 Extender SDK**
- Chọn `Help > Eclipse Marketplace...`
  - Install **ATL/EMFTVM 4.2.1**
## Run plugin
`Bước đầu tiên bạn phải Clone code từ git về máy của bạn. Sau đó bạn có thể chạy plugin theo một trong hai cách sau:`.
### Cách 1: Sử dụng file jar
1. Copy tất cả file `*.jar` ở thư mục JAR cho vào thư mục plugins của Eclipse.
2. Khởi động Eclipse.
3. Chọn `File > Open Project from File System > Directory...`
4. Chọn mở thư mục `plugins` sau bỏ chọn các project sau: `plugins`, `FrslSiriusModel.edit`, `FrslSiriusModel.editor`, `FrslSiriusModel`, `atlplugin, frsl.project.design` sau đó chọn `Finish`.
5. Chọn `File > Open Project from File System > Directory...`
6. Chọn mở thư mục `examples` sau bỏ chọn các project sau: `examples` sau đó chọn `Finish`.
7. Chuột phải vào thư mục bất kỳ chọn `Run As> Eclipse Aplication`.
8. Một workspace mới sẽ được sinh ra.
9. Trong workspace mới, chọn `File > Open Project from File System > Directory...`.
10. Tạo một thư mục mới và tạo 1 file `*.frsl` và điền thông tin vào.
11. Mở file frsl vừa tạo, tại trình chỉnh sửa nhấp chuột phải chọn `OCL > Savs As > FRSLAS`.
12. Hệ thống sẽ sinh ra file `*.frslas`.
13. Tạo một Modeling Project tên là `model-gen` trong workspace.
14. Mở file frslas vừa được sinh ra, chuột phải vào file chọn `FRSLAS to FRSL_SIRIUS > Run Tranformation`.
15. Một file sirius-gen.frslModel.
16. Mở file `*.arid` trong thư mục `model-gen`. Tại phần `Repesentation` chọn `New` sau đó chọn đồ họa mà mình muốn sinh ra (Usecase model diagram, Usecase diagram, Class diagram rồi chọn đầu vào tương ứng và chọn finish.
17. Đồ họa tương ứng sẽ được hiển thị.
### Cách 2: Sử dụng project
1. Khởi động Eclipse.
2. Chọn `File > Open Project from File System > Directory...`
3. Chọn mở thư mục `plugins` sau bỏ chọn các project sau: `plugins` sau đó chọn `Finish`.
4. Chọn `File > Open Project from File System > Directory...`
5. Chọn mở thư mục `examples` sau bỏ chọn các project sau: `examples` sau đó chọn `Finish`.
6. Chuột phải vào thư mục bất kỳ chọn `Run As> Eclipse Aplication`.
7. Một workspace mới sẽ được sinh ra.
8. Trong workspace mới, chọn `File > Open Project from File System > Directory...`.
90. Tạo một thư mục mới và tạo 1 file `*.frsl` và điền thông tin vào.
10. Mở file frsl vừa tạo, tại trình chỉnh sửa nhấp chuột phải chọn `OCL > Savs As > FRSLAS`.
11. Hệ thống sẽ sinh ra file `*.frslas`.
12. Tạo một Modeling Project tên là `model-gen` trong workspace.
13. Mở file frslas vừa được sinh ra, chuột phải vào file chọn `FRSLAS to FRSL_SIRIUS > Run Tranformation`.
14. Một file sirius-gen.frslModel.
15. Mở file `*.arid` trong thư mục `model-gen`. Tại phần `Repesentation` chọn `New` sau đó chọn đồ họa mà mình muốn sinh ra rồi chọn đầu vào tương ứng và chọn finish.
16. Đồ họa tương ứng sẽ được hiển thị.
