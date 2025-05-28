const express = require('express');
const productRoutes = require('./route/productsRoute');

const app = express();
const port = 3000;

// Use express.json() middleware to parse JSON bodies
app.use(express.json());
app.use('/api/products', productRoutes);

app.listen(port, () => {
    console.log(`API rodando na porta ${port}`);
});
