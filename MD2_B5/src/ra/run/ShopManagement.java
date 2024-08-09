package ra.run;

import ra.entity.Categories;
import ra.entity.Product;

import java.util.Scanner;

public class ShopManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Categories[] categoriesArray = new Categories[100];
        Product[] productsArray = new Product[100];
        int categoriesIndex = 0;
        int productsIndex = 0;
        // Khởi tạo các danh mục và sản phẩm (bạn có thể nhập dữ liệu từ bàn phím ở đây)

        int choice;
        do {
            System.out.println("---------------------------SHOP MENU---------------------------");
            System.out.println("1. Quản lý danh mục sản phẩm");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());


            switch (choice) {
                case 1:
                    int categoryChoice;
                    do {
                        System.out.println("---------------------------CATEGORIES MENU---------------------------");
                        System.out.println("1. Nhập thông tin các danh mục");
                        System.out.println("2. Hiển thị thông tin các danh mục");
                        System.out.println("3. Cập nhật thông tin danh mục");
                        System.out.println("4. Xóa danh mục");
                        System.out.println("5. Cập nhật trạng thái danh mục");
                        System.out.println("6. Thoát");
                        System.out.print("Nhập lựa chọn: ");
                        categoryChoice = scanner.nextInt();
                        scanner.nextLine(); // Đọc ký tự newline sau khi đọc số

                        switch (categoryChoice) {
                            case 1:
                                // Nhập thông tin nhiều danh mục (số danh mục do người dùng nhập từ bàn phím)
                                // Lưu thông tin danh mục vào mảng categoriesArray
                                break;
                            case 2:
                                // Hiển thị thông tin tất cả các danh mục đang quản lý
                                break;
                            case 3:
                                // Cập nhật thông tin danh mục
                                // Người dùng nhập mã danh mục cần cập nhật
                                // Kiểm tra mã danh mục có tồn tại trong mảng danh mục hay không
                                // Nếu tồn tại, cho phép người dùng nhập lại các thông tin của danh mục
                                break;
                            case 4:
                                // Xóa danh mục
                                // Người dùng nhập mã danh mục cần xóa
                                // Kiểm tra mã danh mục có tồn tại trong mảng danh mục hay không
                                // Nếu mã danh mục có tồn tại, kiểm tra danh mục đó có chứa sản phẩm không
                                // Nếu không chứa sản phẩm, tiến hành xóa trong mảng danh mục
                                // Nếu chứa sản phẩm, hiển thị thông báo không thể xóa danh mục
                                break;
                            case 5:
                                // Cập nhật trạng thái danh mục (true -> false, false -> true)
                                // Người dùng nhập mã danh mục cần cập nhật trạng thái
                                // Nếu tồn tại mã danh mục, tiến hành cập nhật trạng thái danh mục
                                break;
                            case 6:
                                System.out.println("Quay lại menu SHOP MANAGEMENT");
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                        }
                    } while (categoryChoice != 6);
                    break;
                case 2:
                    int productChoice;
                    do {
                        System.out.println("---------------------------PRODUCT MANAGEMENT---------------------------");
                        System.out.println("1. Nhập thông tin các sản phẩm");
                        System.out.println("2. Hiển thị thông tin các sản phẩm");
                        System.out.println("3. Sắp xếp các sản phẩm theo giá");
                        System.out.println("4. Cập nhật thông tin sản phẩm theo mã sản phẩm");
                        System.out.println("5. Xóa sản phẩm theo mã sản phẩm");
                        System.out.println("6. Tìm kiếm các sản phẩm theo tên sản phẩm");
                        System.out.println("7. Tìm kiếm sản phẩm trong khoảng giá a – b");
                        System.out.println("8. Quay lại menu SHOP MANAGEMENT");
                        System.out.print("Nhập lựa chọn: ");
                        productChoice = scanner.nextInt();
                        scanner.nextLine(); // Đọc ký tự newline sau khi đọc số

                        switch (productChoice) {
                            case 1:
                                // Nhập thông tin nhiều sản phẩm (số sản phẩm do người dùng nhập từ bàn phím)
                                // Lưu thông tin sản phẩm vào mảng productsArray
                                break;
                            case 2:
                                // Hiển thị thông tin tất cả các sản phẩm đang quản lý
                                break;
                            case 3:
                                // Sắp xếp các sản phẩm theo giá
                                // Bạn có thể sử dụng Arrays.sort() hoặc một thuật toán sắp xếp khác
                                break;
                            case 4:
                                // Cập nhật thông tin sản phẩm theo mã sản phẩm
                                // Người dùng nhập mã sản phẩm cần cập nhật
                                // Kiểm tra mã sản phẩm có tồn tại trong mảng sản phẩm hay không
                                // Nếu tồn tại, cho phép người dùng nhập lại các thông tin của sản phẩm
                                break;
                            case 5:
                                // Xóa sản phẩm theo mã sản phẩm
                                // Người dùng nhập mã sản phẩm cần xóa
                                // Kiểm tra mã sản phẩm có tồn tại trong mảng sản phẩm hay không
                                // Nếu mã sản phẩm có tồn tại, tiến hành xóa trong mảng sản phẩm
                                break;
                            case 6:
                                // Tìm kiếm các sản phẩm theo tên sản phẩm
                                // Người dùng nhập tên sản phẩm cần tìm kiếm
                                // Hiển thị danh sách sản phẩm có tên tương ứng
                                break;
                            case 7:
                                // Tìm kiếm sản phẩm trong khoảng giá a – b
                                // Người dùng nhập giá a và b
                                // Hiển thị danh sách sản phẩm có giá trong khoảng [a, b]
                                break;
                            case 8:
                                System.out.println("Quay lại menu SHOP MANAGEMENT");
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                        }
                    } while (productChoice != 8);
                    break;

                case 3:
                    System.out.println("Kết thúc chương trình. Cảm ơn bạn!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 3);

    }
}

