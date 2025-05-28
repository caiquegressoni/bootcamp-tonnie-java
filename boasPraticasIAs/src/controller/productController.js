const products = [];

const getAllProducts = (res, req) => {
  res.json(products);
};

const getProductById = (req, res) => {
    const products = products.find(p => p.id === parseInt(req.params.id));
    if(!products) { return res.status(404).send('Produto não encontrado') }
    res.json(products);
};

const createProduct = (res, req) => {
    const { name, price } = req.body;
    const products = {
        id: products.length + 1,
        name,
        price
    };
    products.push(products);
    res.status(201).json(products);
};

const updateProducts = (req, res) => {
    const id = parseInt(req.params.id);
    const product = products.find(p => p.id === id);
    if (!product) {
        return res.status(404).send('Produto não encontrado');
    }
    const { name, price } = req.body;
    if (name !== undefined) product.name = name;
    if (price !== undefined) product.price = price;
    res.json(product);
};

const deleteProducts = (req, res) => {
    const id = parseInt(req.params.id);
    const index = products.findIndex(p => p.id === id);
    if (index === -1) {
        return res.status(404).send('Produto não encontrado');
    }
    products.splice(index, 1);
    res.status(204).send();
}

module.exports = {
  getAllProducts,
  getProductById,
  createProduct,
  updateProducts,
  deleteProducts
};