const path=require('path'); // require is node JS method. this will give the path
module.exports={
    entry:'./src/app.ts',
    output:{
        filename:'bundle.js',
        path: path.resolve(__dirname,'dist'), // this requires absolute path,
        publicPath:'dist' // any changes made in the ts file will generate a new bundle.js
    },
    devtool:'inline-source-map',
    devServer:{
        static:__dirname,
        host:'127.0.0.1',
        port:8091,
        historyApiFallback: true
    },
    module:{
        rules:[
            {
                test: /\.ts$/,
                use:'ts-loader',
                exclude: /node_modules/
            }
        ]
    },
    resolve:{
        extensions:['.ts','.js']
    }
};