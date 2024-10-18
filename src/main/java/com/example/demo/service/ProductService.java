    package com.example.demo.service;

    import com.example.demo.entity.ProductEntity;
    import org.springframework.stereotype.Service;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Optional;
    import java.util.UUID;

    @Service
    public class ProductService {
        private final List<ProductEntity> products;

        public ProductService() {
            this.products = new ArrayList<>();
            // Initialize with sample products
            products.add(new ProductEntity("Laptop", "Electrónica", 100.000, 50));
            products.add(new ProductEntity("Silla", "Muebles", 100.000, 30));
            products.add(new ProductEntity("Cámara", "Fotografía", 100.000, 15));
        }

        public List<ProductEntity> getAllProducts() {
            return new ArrayList<>(products);
        }

        public Optional<ProductEntity> getProductById(UUID id) {
            return products.stream()
                    .filter(product -> product.getId().equals(id))
                    .findFirst();
        }

        public ProductEntity createProduct(ProductEntity product) {
            products.add(product);
            return product;
        }

        public Optional<ProductEntity> updateProduct(UUID id, ProductEntity updatedProduct) {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId().equals(id)) {
                    updatedProduct.setId(id);
                    products.set(i, updatedProduct);
                    return Optional.of(updatedProduct);
                }
            }
            return Optional.empty();
        }

        public boolean deleteProduct(UUID id) {
            return products.removeIf(product -> product.getId().equals(id));
        }
    }