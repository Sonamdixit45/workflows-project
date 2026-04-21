const products = [
  { name: "samsung", amount: 70000, quantity: 10 },
  { name: "Iphone",  amount: 10000, quantity: 1 }
];

function buyProduct(product_name, cb) {
  // 1. Look for the product
  let foundProduct = null;
  for (let i = 0; i < products.length; i++) {
    if (products[i].name.toLowerCase() === product_name.toLowerCase()) {
      foundProduct = products[i];
      break;                     // stop looping once we’ve found it
    }
  }

  // 2. Handle missing product
  if (!foundProduct) {
    console.log(`❌ Sorry, ${product_name} is not available.`);
    return;                      // bail out—no callback
  }

  // 3. Simulate async DB work, then run the callback
  setTimeout(() => {
    console.log(`✅ Order complete for ${foundProduct.name} (₹${foundProduct.amount})`);
    cb(foundProduct);            // pass the product to the callback if you like
  }, 1000);                      // 1‑second fake delay
}

// Usage
buyProduct("Iphone 16", (p) => {
  console.log("Product purchased:", p);
});

buyProduct("Iphone", (p) => {
  console.log("Product purchased:", p);
});
